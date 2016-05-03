package yes.please.companydata.database.schemas;

import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Schema;
import yes.please.companydata.database.SchemaVersion;

public class Version1 extends SchemaVersion {

    public Version1(boolean current) {
        super(current);
        addEntities(getSchema());
    }

    @Override
    public int getVersionNumber() {
        return 1;
    }

    private static void addEntities(Schema schema) {

        Entity account = schema.addEntity("Business");
        account.setTableName("business");
        account.addIdProperty()
                .columnName("id");
        account.addStringProperty("storeCode")
                .columnName("storecode");
        account.addStringProperty("businessName")
                .columnName("businessname");
        account.addStringProperty("logo")
                .columnName("logo");
        account.addStringProperty("backgroundImage")
                .columnName("backgroundimage")
                .notNull();
        account.addStringProperty("backgroundColor")
                .columnName("backgroundcolor");
        account.addStringProperty("headerColor")
                .columnName("headercolor");
        account.addStringProperty("footerColor")
                .columnName("footercolor");
        account.addBooleanProperty("ifLogo")
                .columnName("iflogo")
                .notNull();
        account.addBooleanProperty("ifMail")
                .columnName("ifmail")
                .notNull();
        account.addBooleanProperty("ifFacebook")
                .columnName("iffacebook")
                .notNull();
        account.addBooleanProperty("ifTwitter")
                .columnName("iftwitter")
                .notNull();
        account.addBooleanProperty("ifLinkedin")
                .columnName("iflinkedin")
                .notNull();
        account.addBooleanProperty("ifGoogleplus")
                .columnName("ifgoogleplus")
                .notNull();
        account.addBooleanProperty("ifYoutube")
                .columnName("ifyoutube")
                .notNull();
        account.addBooleanProperty("ifPhone")
                .columnName("ifphone")
                .notNull();
        account.addBooleanProperty("ifGallery")
                .columnName("ifgallery")
                .notNull();
        account.addBooleanProperty("ifAbout")
                .columnName("ifabout")
                .notNull();
        account.addBooleanProperty("ifWebsite")
                .columnName("ifwebsite")
                .notNull();
        account.addBooleanProperty("ifMap")
                .columnName("ifmap")
                .notNull();
        account.addBooleanProperty("ifPinterest")
                .columnName("ifpinterest")
                .notNull();
        account.addBooleanProperty("ifAndroid")
                .columnName("ifandroid")
                .notNull();
        account.addStringProperty("mainText")
                .columnName("maintext");
        account.addStringProperty("mailIconColor")
                .columnName("mail_icon_color");
        account.addStringProperty("mailLabelColor")
                .columnName("mail_label_color");
        account.addStringProperty("mailLabel")
                .columnName("mail_label");
        account.addStringProperty("facebookIconColor")
                .columnName("facebook_icon_color");
        account.addStringProperty("facebookLabelColor")
                .columnName("facebook_label_color");
        account.addStringProperty("facebookLabel")
                .columnName("facebook_label");
        account.addStringProperty("twitterIconColor")
                .columnName("twitter_icon_color");
        account.addStringProperty("twitterLabelColor")
                .columnName("twitter_label_color");
        account.addStringProperty("twitterLabel")
                .columnName("twitter_label");
        account.addStringProperty("linkedinIconColor")
                .columnName("linkedin_icon_color");
        account.addStringProperty("linkedinLabelColor")
                .columnName("linkedin_label_color");
        account.addStringProperty("linkedinLabel")
                .columnName("linkedin_label");
        account.addStringProperty("googleplusIconColor")
                .columnName("googleplus_icon_color");
        account.addStringProperty("googleplusLabelColor")
                .columnName("googleplus_label_color");
        account.addStringProperty("googleplusLabel")
                .columnName("googleplus_label");
        account.addStringProperty("mailAddress")
                .columnName("mail_address");
        account.addStringProperty("facebookAddress")
                .columnName("facebook_address");
        account.addStringProperty("twitterAddress")
                .columnName("twitter_address");
        account.addStringProperty("linkedinAddress")
                .columnName("linkedin_address");
        account.addStringProperty("googleplusAddress")
                .columnName("googleplus_address");
        account.addStringProperty("youtubeIconColor")
                .columnName("youtube_icon_color");
        account.addStringProperty("youtubeLabelColor")
                .columnName("youtube_label_color");
        account.addStringProperty("youtubeLabel")
                .columnName("youtube_label");
        account.addStringProperty("youtubeAddress")
                .columnName("youtube_address");
        account.addStringProperty("phoneLabelColor")
                .columnName("phone_label_color");
        account.addStringProperty("phoneIconColor")
                .columnName("phone_icon_color");
        account.addStringProperty("phoneLabel")
                .columnName("phone_label");
        account.addStringProperty("phoneAddress")
                .columnName("phone_address");
        account.addStringProperty("galleryIconColor")
                .columnName("gallery_icon_color");
        account.addStringProperty("galleryLabelColor")
                .columnName("gallery_label_color");
        account.addStringProperty("galleryLabel")
                .columnName("gallery_label");
        account.addStringProperty("galleryAddress")
                .columnName("gallery_address");
        account.addStringProperty("aboutIconColor")
                .columnName("about_icon_color");
        account.addStringProperty("aboutLabelColor")
                .columnName("about_label_color");
        account.addStringProperty("aboutLabel")
                .columnName("about_label");
        account.addStringProperty("aboutAddress")
                .columnName("about_address");
        account.addStringProperty("websiteIconColor")
                .columnName("website_icon_color");
        account.addStringProperty("websiteLabelColor")
                .columnName("website_label_color");
        account.addStringProperty("websiteLabel")
                .columnName("website_label");
        account.addStringProperty("websiteAddress")
                .columnName("website_address");
        account.addStringProperty("mapIconColor")
                .columnName("map_icon_color");
        account.addStringProperty("mapLabelColor")
                .columnName("map_label_color");
        account.addStringProperty("mapLabel")
                .columnName("map_label");
        account.addStringProperty("mapAddress")
                .columnName("map_address");
        account.addStringProperty("pinterestIconColor")
                .columnName("pinterest_icon_color");
        account.addStringProperty("pinterestLabelColor")
                .columnName("pinterest_label_color");
        account.addStringProperty("pinterestLabel")
                .columnName("pinterest_label");
        account.addStringProperty("pinterestAddress")
                .columnName("pinterest_address");
        account.addStringProperty("androidIconColor")
                .columnName("android_icon_color");
        account.addStringProperty("androidLabelColor")
                .columnName("android_label_color");
        account.addStringProperty("androidLabel")
                .columnName("android_label");
        account.addStringProperty("androidAddress")
                .columnName("android_address");
        account.addBooleanProperty("ifBusinessname")
                .columnName("ifbusinessname")
                .notNull();
        account.addStringProperty("businessnameColor")
                .columnName("businessname_color");
        account.addStringProperty("maintextColor")
                .columnName("maintext_color");
        account.addBooleanProperty("ifFooter")
                .columnName("iffooter")
                .notNull();
        account.addBooleanProperty("ifHeader")
                .columnName("ifheader")
                .notNull();
        account.addBooleanProperty("ifUserplus")
                .columnName("ifuserplus")
                .notNull();
        account.addStringProperty("userplusIconColor")
                .columnName("userplus_icon_color");
        account.addStringProperty("userplusLabelColor")
                .columnName("userplus_label_color");
        account.addStringProperty("userplusLabel")
                .columnName("userplus_label");
        account.addStringProperty("bitly")
                .columnName("bitly");
        account.addStringProperty("maskyoo")
                .columnName("maskyoo");
        account.addBooleanProperty("active")
                .columnName("active")
                .notNull();
        account.addStringProperty("aboutTextColor")
                .columnName("about_text_color");
        account.addStringProperty("footerIconsColor")
                .columnName("footer_icons_color");
        account.addStringProperty("footerIconsBackground")
                .columnName("footer_icons_background");
        account.addStringProperty("realPhone")
                .columnName("realphone");
        account.addIntProperty("monthlySms")
                .columnName("monthlysms")
                .notNull();
        account.addStringProperty("chatIconColor")
                .columnName("chat_icon_color");
        account.addStringProperty("chatLabelColor")
                .columnName("chat_label_color");
        account.addStringProperty("chatLabel")
                .columnName("chat_label");
        account.addBooleanProperty("ifChat")
                .columnName("ifchat")
                .notNull();
        account.addIntProperty("test")
                .columnName("test")
                .notNull();

        /* Relations */
    }
}