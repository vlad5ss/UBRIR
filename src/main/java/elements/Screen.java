package elements;

import core.InitialDriver;
import enums.Direction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import lombok.var;
import org.apache.log4j.Logger;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

import java.time.Duration;


public class Screen {
    private AndroidDriver driver = InitialDriver.getDriver();
    private static Logger log = Logger.getLogger(Screen.class);

    public void scrollablePage(String text) {
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textContains(" + "\"" + text + "\"" + ").instance(0));");
        log.info("Page is scrollable");
    }

    public void swipeScreenWithPressTime(Direction dir, int pressTime, Point pointStart) {
        final int ANIMATION_TIME = 200;

        Point pointEnd;
        PointOption pointOptionStart, pointOptionEnd;

        int edgeBorder = 10;

        Dimension dims = driver.manage().window().getSize();

        if (pointStart == null) {
            pointStart = new Point(dims.width / 2, dims.height / 2);
        }

        switch (dir) {
            case DOWN: // center of footer
                pointEnd = new Point(dims.width / 2, dims.height - edgeBorder);
                break;
            case UP: // center of header
                pointEnd = new Point(dims.width / 2, edgeBorder);
                break;
            case LEFT: // center of left side
                pointEnd = new Point(edgeBorder, dims.height / 2);
                break;
            case RIGHT: // center of right side
                pointEnd = new Point(dims.width - edgeBorder, dims.height / 2);
                break;
            default:
                throw new IllegalArgumentException("swipeScreen(): dir: '" + dir.toString() + "' NOT supported");
        }

        pointOptionStart = PointOption.point(pointStart.x, pointStart.y);
        pointOptionEnd = PointOption.point(pointEnd.x, pointEnd.y);

        try {
            new TouchAction(driver)
                    .press(pointOptionStart)
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(pressTime)))
                    .moveTo(pointOptionEnd)
                    .release().perform();
        } catch (Exception e) {
            System.err.println("swipeScreen(): TouchAction FAILED\n" + e.getMessage());
            return;
        }

        try {
            Thread.sleep(ANIMATION_TIME);
        } catch (InterruptedException e) {
            // ignore
        }
    }

    /**
     * @param heightPart  - part of the height by which to divide the whole height
     * @param widthPart - part of the width by which to divide the whole width
     */
    public Point setPointForSwipe(Float heightPart, Float widthPart) {
        var dims = driver
                .manage()
                .window()
                .getSize();
        return new Point( (int) (dims.width / widthPart), (int) (dims.height / heightPart));
    }

    public void scroll(String locator, int swipes) {
        int swipesAmount = 0;
        while (swipesAmount < swipes) {
            try {
                driver.findElementByAndroidUIAutomator(locator);
                swipesAmount++;
            } catch (Exception e) {
                swipesAmount++;
            }
        }
    }

    public void scrollDown(int swipes) {
        String locator = "new UiScrollable(new UiSelector().resourceIdMatches(\".*ontainer.*\")).flingToEnd(1)";
        scroll(locator, swipes);
    }

    public void swipeVertical(float percentage) {
        Dimension windowSize = driver.manage().window().getSize();
        TouchAction ta = new TouchAction(driver);
        ta.press(PointOption.point(207, 582)).moveTo(PointOption.point(8,
                -360)).release().perform();
    }


}
