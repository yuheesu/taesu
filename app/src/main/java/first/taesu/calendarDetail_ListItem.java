package first.taesu;

/**
 * Created by park on 2017-04-01.
 */

public class calendarDetail_ListItem {
    private String head;
    private String desc;
    private String imageUrl;

    calendarDetail_ListItem(String head, String desc, String imageUrl){
        this.head = head;
        this.desc = desc;
        this.imageUrl = imageUrl;
    }

    public String getHead() {
        return head;
    }

    public String getDesc() {
        return desc;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
