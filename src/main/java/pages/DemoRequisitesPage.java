package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class DemoRequisitesPage {
    private static final String REQUISITES_FIELDS = "//androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]";
    private static final String BENEFICIARY_TEXT = "Beneficiary";

    @AndroidFindBy(id = "cb.ibank:id/share")
    public MobileElement SHARE_BUTTON;
    @AndroidFindBy(id = "cb.ibank:id/item_detail_body")
    public MobileElement ITEM_DETAIL;
    @AndroidFindBy(xpath = REQUISITES_FIELDS)
    public MobileElement FIELD_REQUISITE;
}
