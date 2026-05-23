package p000;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import java.io.IOException;
import okhttp3.internal.http2.Settings;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᤞᛸᲁᲇᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2860 extends MenuInflater {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final Class[] f9162;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final Class[] f9163;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Object[] f9164;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Object[] f9165;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Context f9166;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public Object f9167;

    static {
        Class[] clsArr = {Context.class};
        f9162 = clsArr;
        f9163 = clsArr;
    }

    public C2860(Context context) {
        super(context);
        this.f9166 = context;
        Object[] objArr = {context};
        this.f9164 = objArr;
        this.f9165 = objArr;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static Object m4862(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m4862(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof MenuC1944)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z = false;
        try {
            try {
                layout = this.f9166.getResources().getLayout(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (true) {
                    MenuC1944 menuC1944 = (MenuC1944) menu;
                    if (!menuC1944.f6419) {
                        menuC1944.m3772();
                        z = true;
                    }
                }
                m4863(layout, attributeSetAsAttributeSet, menu);
                if (z) {
                    ((MenuC1944) menu).m3771();
                }
                layout.close();
            } catch (IOException e) {
                throw new InflateException("Error inflating menu XML", e);
            } catch (XmlPullParserException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } catch (Throwable th) {
            if (z) {
                ((MenuC1944) menu).m3771();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m4863(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i;
        ColorStateList colorStateList;
        int resourceId;
        C2859 c2859 = new C2859(this, menu);
        int eventType = xmlPullParser.getEventType();
        do {
            i = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlPullParser.next();
                break;
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType == 2) {
                if (!z2) {
                    String name2 = xmlPullParser.getName();
                    boolean zEquals = name2.equals("group");
                    Context context = this.f9166;
                    if (zEquals) {
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2470.f7889);
                        c2859.f9133 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                        c2859.f9134 = typedArrayObtainStyledAttributes.getInt(3, 0);
                        c2859.f9135 = typedArrayObtainStyledAttributes.getInt(4, 0);
                        c2859.f9136 = typedArrayObtainStyledAttributes.getInt(5, 0);
                        c2859.f9137 = typedArrayObtainStyledAttributes.getBoolean(2, true);
                        c2859.f9138 = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                    } else if (name2.equals("item")) {
                        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC2470.f7890);
                        c2859.f9140 = typedArrayObtainStyledAttributes2.getResourceId(2, 0);
                        c2859.f9141 = (typedArrayObtainStyledAttributes2.getInt(5, c2859.f9134) & (-65536)) | (typedArrayObtainStyledAttributes2.getInt(6, c2859.f9135) & 65535);
                        c2859.f9142 = typedArrayObtainStyledAttributes2.getText(7);
                        c2859.f9143 = typedArrayObtainStyledAttributes2.getText(8);
                        c2859.f9144 = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                        String string = typedArrayObtainStyledAttributes2.getString(9);
                        c2859.f9145 = string == null ? (char) 0 : string.charAt(0);
                        c2859.f9146 = typedArrayObtainStyledAttributes2.getInt(16, 4096);
                        String string2 = typedArrayObtainStyledAttributes2.getString(10);
                        c2859.f9147 = string2 == null ? (char) 0 : string2.charAt(0);
                        c2859.f9148 = typedArrayObtainStyledAttributes2.getInt(20, 4096);
                        if (typedArrayObtainStyledAttributes2.hasValue(11)) {
                            c2859.f9149 = typedArrayObtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                        } else {
                            c2859.f9149 = c2859.f9136;
                        }
                        c2859.f9150 = typedArrayObtainStyledAttributes2.getBoolean(3, false);
                        c2859.f9151 = typedArrayObtainStyledAttributes2.getBoolean(4, c2859.f9137);
                        c2859.f9152 = typedArrayObtainStyledAttributes2.getBoolean(1, c2859.f9138);
                        c2859.f9153 = typedArrayObtainStyledAttributes2.getInt(21, -1);
                        c2859.f9156 = typedArrayObtainStyledAttributes2.getString(12);
                        c2859.f9154 = typedArrayObtainStyledAttributes2.getResourceId(13, 0);
                        c2859.f9155 = typedArrayObtainStyledAttributes2.getString(15);
                        String string3 = typedArrayObtainStyledAttributes2.getString(14);
                        boolean z3 = string3 != null;
                        if (z3 && c2859.f9154 == 0 && c2859.f9155 == null) {
                            if (c2859.m4860(string3, f9163, this.f9165) != null) {
                                throw new ClassCastException();
                            }
                        } else if (z3) {
                            Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                        }
                        c2859.f9157 = typedArrayObtainStyledAttributes2.getText(17);
                        c2859.f9158 = typedArrayObtainStyledAttributes2.getText(22);
                        if (typedArrayObtainStyledAttributes2.hasValue(19)) {
                            c2859.f9160 = AbstractC1105.m2676(typedArrayObtainStyledAttributes2.getInt(19, -1), c2859.f9160);
                        } else {
                            c2859.f9160 = null;
                        }
                        if (typedArrayObtainStyledAttributes2.hasValue(18)) {
                            if (!typedArrayObtainStyledAttributes2.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = AbstractC2203.m4030(context, resourceId)) == null) {
                                colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(18);
                            }
                            c2859.f9159 = colorStateList;
                        } else {
                            c2859.f9159 = null;
                        }
                        typedArrayObtainStyledAttributes2.recycle();
                        c2859.f9139 = false;
                        xmlPullParser = xmlPullParser;
                    } else if (name2.equals("menu")) {
                        c2859.f9139 = true;
                        SubMenu subMenuAddSubMenu = c2859.f9132.addSubMenu(c2859.f9133, c2859.f9140, c2859.f9141, c2859.f9142);
                        c2859.m4861(subMenuAddSubMenu.getItem());
                        xmlPullParser = xmlPullParser;
                        m4863(xmlPullParser, attributeSet, subMenuAddSubMenu);
                    } else {
                        xmlPullParser = xmlPullParser;
                        str = name2;
                        z2 = true;
                    }
                }
                z = false;
            } else if (eventType != 3) {
                z = false;
            } else {
                String name3 = xmlPullParser.getName();
                if (z2 && name3.equals(str)) {
                    xmlPullParser = xmlPullParser;
                    z2 = false;
                    str = null;
                } else {
                    if (name3.equals("group")) {
                        c2859.f9133 = 0;
                        c2859.f9134 = 0;
                        c2859.f9135 = 0;
                        c2859.f9136 = 0;
                        c2859.f9137 = true;
                        c2859.f9138 = true;
                    } else if (name3.equals("item")) {
                        if (!c2859.f9139) {
                            c2859.f9139 = true;
                            c2859.m4861(c2859.f9132.add(c2859.f9133, c2859.f9140, c2859.f9141, c2859.f9142));
                        }
                    } else if (name3.equals("menu")) {
                        z = true;
                    }
                    z = z;
                }
            }
            eventType = xmlPullParser.next();
            i = 2;
            z = z;
            z2 = z2;
        }
    }
}
