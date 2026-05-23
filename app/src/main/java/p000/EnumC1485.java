package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲈᲇᲁᲀᛸᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1485 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final C1227 f5264;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final EnumC1485 f5265;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final EnumC1485 f5266;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final EnumC1485 f5267;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final EnumC1485 f5268;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final EnumC1485 f5269;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final EnumC1485 f5270;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC1485[] f5271;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static final /* synthetic */ C1225 f5272;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final String f5273;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final String f5274;

    static {
        String[] strArr = AbstractC1574.f5469;
        EnumC1485 enumC1485 = new EnumC1485("ALL", 0, "all", "");
        f5265 = enumC1485;
        EnumC1485 enumC1486 = new EnumC1485("GROUP", 1, "group", "left join rcontact using (username)\nwhere username like '%@chatroom'\n    or username like '%@im.chatroom'\norder by flag desc;");
        f5266 = enumC1486;
        EnumC1485 enumC1487 = new EnumC1485("FRIEND", 2, "friend", "left join rcontact using (username)\nwhere not (username like '%@chatroom' or username like '%@im.chatroom')\n  and not ((ifnull(verifyFlag, 0) & 8) != 0\n      or (ifnull(attrflag, 0) & 2097152) != 0\n      or (ifnull(attrflag, 0) & 8388608) != 0\n      or (ifnull(attrflag, 0) & 16777216) != 0\n  )\n  and lower(username) not in ('officialaccounts', 'appbrandcustomerservicemsg', 'opencustomerservicemsg', 'service_officialaccounts')\n  and lower(username) not in (\n      'qqmail','fmessage','tmessage','qmessage','qqsync','floatbottle','lbsapp','shakeapp',\n      'medianote','qqfriend','newsapp','blogapp','facebookapp','topstoryapp','masssendapp',\n      'feedsapp','voipapp','cardpackage','voicevoipapp','voiceinputapp','linkedinplugin',\n      'notifymessage','appbrand_notify_message','conversationboxservice'\n  )\n  and (username not like '%@%' or username like '%@micromsg.qq.com')\norder by flag desc;");
        f5267 = enumC1487;
        EnumC1485 enumC1488 = new EnumC1485("OFFICIAL", 3, "official", "left join rcontact using (username)\nwhere ((ifnull(verifyFlag, 0) & 8) != 0\n    or (ifnull(attrflag, 0) & 2097152) != 0\n    or (ifnull(attrflag, 0) & 8388608) != 0\n    or (ifnull(attrflag, 0) & 16777216) != 0\n)\nand lower(username) not in ('officialaccounts', 'appbrandcustomerservicemsg', 'opencustomerservicemsg', 'service_officialaccounts')\norder by flag desc;");
        f5268 = enumC1488;
        EnumC1485 enumC1489 = new EnumC1485("UNREAD", 4, "unread", "left join rcontact using (username)\nwhere (unReadCount > 0)\n  and not ((ifnull(verifyFlag, 0) & 8) != 0\n      or (ifnull(attrflag, 0) & 2097152) != 0\n      or (ifnull(attrflag, 0) & 8388608) != 0\n      or (ifnull(attrflag, 0) & 16777216) != 0\n  )\n  and lower(username) not in ('officialaccounts', 'appbrandcustomerservicemsg', 'opencustomerservicemsg', 'service_officialaccounts')\n  and lower(username) not in (\n      'qqmail','fmessage','tmessage','qmessage','qqsync','floatbottle','lbsapp','shakeapp',\n      'medianote','qqfriend','newsapp','blogapp','facebookapp','topstoryapp','masssendapp',\n      'feedsapp','voipapp','cardpackage','voicevoipapp','voiceinputapp','linkedinplugin',\n      'notifymessage','appbrand_notify_message','conversationboxservice'\n  )\norder by flag desc;");
        f5269 = enumC1489;
        EnumC1485 enumC14810 = new EnumC1485("CUSTOM", 5, "custom", "");
        f5270 = enumC14810;
        EnumC1485[] enumC1485Arr = {enumC1485, enumC1486, enumC1487, enumC1488, enumC1489, enumC14810};
        f5271 = enumC1485Arr;
        f5272 = new C1225(enumC1485Arr);
        f5264 = new C1227(15);
    }

    public EnumC1485(String str, int i, String str2, String str3) {
        super(str, i);
        this.f5273 = str2;
        this.f5274 = str3;
    }

    public static EnumC1485 valueOf(String str) {
        return (EnumC1485) Enum.valueOf(EnumC1485.class, str);
    }

    public static EnumC1485[] values() {
        return (EnumC1485[]) f5271.clone();
    }
}
