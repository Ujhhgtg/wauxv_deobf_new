package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᛸᤝᲀᲇᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1497 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final C1224 f5297;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final EnumC1497 f5298;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final EnumC1497 f5299;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final EnumC1497 f5300;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final EnumC1497 f5301;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final EnumC1497 f5302;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final EnumC1497 f5303;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC1497[] f5304;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final /* synthetic */ C1227 f5305;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f5306;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final String f5307;

    static {
        String[] strArr = AbstractC1471.f5234;
        EnumC1497 enumC1497 = new EnumC1497("ALL", 0, "all", "");
        f5298 = enumC1497;
        EnumC1497 enumC1498 = new EnumC1497("GROUP", 1, "group", "left join rcontact using (username)\nwhere (username like '%@chatroom' or username like '%@im.chatroom')\n  and (ifnull(parentRef, '') != 'hidden_conv_parent')\norder by flag desc;");
        f5299 = enumC1498;
        EnumC1497 enumC1499 = new EnumC1497("FRIEND", 2, "friend", "left join rcontact using (username)\nwhere not (username like '%@chatroom' or username like '%@im.chatroom')\n  and not ((ifnull(verifyFlag, 0) & 8) != 0\n      or (ifnull(attrflag, 0) & 2097152) != 0\n      or (ifnull(attrflag, 0) & 8388608) != 0\n      or (ifnull(attrflag, 0) & 16777216) != 0\n  )\n  and lower(username) not in ('officialaccounts', 'appbrandcustomerservicemsg', 'opencustomerservicemsg', 'service_officialaccounts')\n  and lower(username) not in (\n      'qqmail','fmessage','tmessage','qmessage','qqsync','floatbottle','lbsapp','shakeapp',\n      'medianote','qqfriend','newsapp','blogapp','facebookapp','topstoryapp','masssendapp',\n      'feedsapp','voipapp','cardpackage','voicevoipapp','voiceinputapp','linkedinplugin',\n      'notifymessage','appbrand_notify_message','conversationboxservice'\n  )\n  and (username not like '%@%' or username like '%@micromsg.qq.com')\n  and (ifnull(parentRef, '') != 'hidden_conv_parent')\norder by flag desc;");
        f5300 = enumC1499;
        EnumC1497 enumC14910 = new EnumC1497("OFFICIAL", 3, "official", "left join rcontact using (username)\nwhere ((ifnull(verifyFlag, 0) & 8) != 0\n    or (ifnull(attrflag, 0) & 2097152) != 0\n    or (ifnull(attrflag, 0) & 8388608) != 0\n    or (ifnull(attrflag, 0) & 16777216) != 0\n)\nand lower(username) not in ('officialaccounts', 'appbrandcustomerservicemsg', 'opencustomerservicemsg', 'service_officialaccounts')\nand (ifnull(parentRef, '') != 'hidden_conv_parent')\norder by flag desc;");
        f5301 = enumC14910;
        EnumC1497 enumC14911 = new EnumC1497("UNREAD", 4, "unread", "left join rcontact using (username)\nwhere (unReadCount > 0)\n  and not ((ifnull(verifyFlag, 0) & 8) != 0\n      or (ifnull(attrflag, 0) & 2097152) != 0\n      or (ifnull(attrflag, 0) & 8388608) != 0\n      or (ifnull(attrflag, 0) & 16777216) != 0\n  )\n  and lower(username) not in ('officialaccounts', 'appbrandcustomerservicemsg', 'opencustomerservicemsg', 'service_officialaccounts')\n  and lower(username) not in (\n      'qqmail','fmessage','tmessage','qmessage','qqsync','floatbottle','lbsapp','shakeapp',\n      'medianote','qqfriend','newsapp','blogapp','facebookapp','topstoryapp','masssendapp',\n      'feedsapp','voipapp','cardpackage','voicevoipapp','voiceinputapp','linkedinplugin',\n      'notifymessage','appbrand_notify_message','conversationboxservice'\n  )\norder by flag desc;");
        f5302 = enumC14911;
        EnumC1497 enumC14912 = new EnumC1497("CUSTOM", 5, "custom", "");
        f5303 = enumC14912;
        EnumC1497[] enumC1497Arr = {enumC1497, enumC1498, enumC1499, enumC14910, enumC14911, enumC14912};
        f5304 = enumC1497Arr;
        f5305 = new C1227(enumC1497Arr);
        f5297 = new C1224(16);
    }

    public EnumC1497(String str, int i, String str2, String str3) {
        super(str, i);
        this.f5306 = str2;
        this.f5307 = str3;
    }

    public static EnumC1497 valueOf(String str) {
        return (EnumC1497) Enum.valueOf(EnumC1497.class, str);
    }

    public static EnumC1497[] values() {
        return (EnumC1497[]) f5304.clone();
    }
}
