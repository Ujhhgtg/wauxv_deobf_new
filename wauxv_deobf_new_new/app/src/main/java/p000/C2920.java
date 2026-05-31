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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᲇᤝᤞᛸᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2920 extends MenuInflater {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final Class[] f9332;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final Class[] f9333;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Object[] f9334;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Object[] f9335;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Context f9336;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public Object f9337;

    static {
        Class[] clsArr = {Context.class};
        f9332 = clsArr;
        f9333 = clsArr;
    }

    public C2920(Context context) {
        super(context);
        this.f9336 = context;
        Object[] objArr = {context};
        this.f9334 = objArr;
        this.f9335 = objArr;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static Object m4923(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m4923(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof MenuC1975)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z = false;
        try {
            try {
                layout = this.f9336.getResources().getLayout(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof MenuC1975) {
                    MenuC1975 menuC1975 = (MenuC1975) menu;
                    if (!menuC1975.f6524) {
                        menuC1975.m3966();
                        z = true;
                    }
                }
                m4924(layout, attributeSetAsAttributeSet, menu);
                if (z) {
                    ((MenuC1975) menu).m3965();
                }
                layout.close();
            } catch (IOException e) {
                throw new InflateException("Error inflating menu XML", e);
            } catch (XmlPullParserException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } catch (Throwable th) {
            if (z) {
                ((MenuC1975) menu).m3965();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m4924(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i;
        ColorStateList colorStateList;
        int resourceId;
        C2919 c2919 = new C2919(this, menu);
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
            if (eventType == i) {
                if (!z2) {
                    String name2 = xmlPullParser.getName();
                    boolean zEquals = name2.equals("group");
                    Context context = this.f9336;
                    if (zEquals) {
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2523.f8038);
                        c2919.f9303 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                        c2919.f9304 = typedArrayObtainStyledAttributes.getInt(3, 0);
                        c2919.f9305 = typedArrayObtainStyledAttributes.getInt(4, 0);
                        c2919.f9306 = typedArrayObtainStyledAttributes.getInt(5, 0);
                        c2919.f9307 = typedArrayObtainStyledAttributes.getBoolean(2, true);
                        c2919.f9308 = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                    } else if (name2.equals("item")) {
                        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC2523.f8039);
                        c2919.f9310 = typedArrayObtainStyledAttributes2.getResourceId(2, 0);
                        c2919.f9311 = (typedArrayObtainStyledAttributes2.getInt(5, c2919.f9304) & (-65536)) | (typedArrayObtainStyledAttributes2.getInt(6, c2919.f9305) & Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        c2919.f9312 = typedArrayObtainStyledAttributes2.getText(7);
                        c2919.f9313 = typedArrayObtainStyledAttributes2.getText(8);
                        c2919.f9314 = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                        String string = typedArrayObtainStyledAttributes2.getString(9);
                        c2919.f9315 = string == null ? (char) 0 : string.charAt(0);
                        c2919.f9316 = typedArrayObtainStyledAttributes2.getInt(16, 4096);
                        String string2 = typedArrayObtainStyledAttributes2.getString(10);
                        c2919.f9317 = string2 == null ? (char) 0 : string2.charAt(0);
                        c2919.f9318 = typedArrayObtainStyledAttributes2.getInt(20, 4096);
                        if (typedArrayObtainStyledAttributes2.hasValue(11)) {
                            c2919.f9319 = typedArrayObtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                        } else {
                            c2919.f9319 = c2919.f9306;
                        }
                        c2919.f9320 = typedArrayObtainStyledAttributes2.getBoolean(3, false);
                        c2919.f9321 = typedArrayObtainStyledAttributes2.getBoolean(4, c2919.f9307);
                        c2919.f9322 = typedArrayObtainStyledAttributes2.getBoolean(1, c2919.f9308);
                        c2919.f9323 = typedArrayObtainStyledAttributes2.getInt(21, -1);
                        c2919.f9326 = typedArrayObtainStyledAttributes2.getString(12);
                        c2919.f9324 = typedArrayObtainStyledAttributes2.getResourceId(13, 0);
                        c2919.f9325 = typedArrayObtainStyledAttributes2.getString(15);
                        String string3 = typedArrayObtainStyledAttributes2.getString(14);
                        boolean z3 = string3 != null;
                        if (z3 && c2919.f9324 == 0 && c2919.f9325 == null) {
                            if (c2919.m4921(string3, f9333, this.f9335) != null) {
                                throw new ClassCastException();
                            }
                        } else if (z3) {
                            Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                        }
                        c2919.f9327 = typedArrayObtainStyledAttributes2.getText(17);
                        c2919.f9328 = typedArrayObtainStyledAttributes2.getText(22);
                        if (typedArrayObtainStyledAttributes2.hasValue(19)) {
                            c2919.f9330 = AbstractC1111.m2825(typedArrayObtainStyledAttributes2.getInt(19, -1), c2919.f9330);
                        } else {
                            c2919.f9330 = null;
                        }
                        if (typedArrayObtainStyledAttributes2.hasValue(18)) {
                            if (!typedArrayObtainStyledAttributes2.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = AbstractC1469.m3333(context, resourceId)) == null) {
                                colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(18);
                            }
                            c2919.f9329 = colorStateList;
                        } else {
                            c2919.f9329 = null;
                        }
                        typedArrayObtainStyledAttributes2.recycle();
                        c2919.f9309 = false;
                        xmlPullParser = xmlPullParser;
                    } else if (name2.equals("menu")) {
                        c2919.f9309 = true;
                        SubMenu subMenuAddSubMenu = c2919.f9302.addSubMenu(c2919.f9303, c2919.f9310, c2919.f9311, c2919.f9312);
                        c2919.m4922(subMenuAddSubMenu.getItem());
                        xmlPullParser = xmlPullParser;
                        m4924(xmlPullParser, attributeSet, subMenuAddSubMenu);
                    } else {
                        xmlPullParser = xmlPullParser;
                        str = name2;
                        z2 = true;
                    }
                }
                z = z;
            } else if (eventType != 3) {
                z = z;
            } else {
                String name3 = xmlPullParser.getName();
                if (z2 && name3.equals(str)) {
                    xmlPullParser = xmlPullParser;
                    z2 = false;
                    str = null;
                } else {
                    if (name3.equals("group")) {
                        c2919.f9303 = 0;
                        c2919.f9304 = 0;
                        c2919.f9305 = 0;
                        c2919.f9306 = 0;
                        c2919.f9307 = true;
                        c2919.f9308 = true;
                    } else if (name3.equals("item")) {
                        if (!c2919.f9309) {
                            c2919.f9309 = true;
                            c2919.m4922(c2919.f9302.add(c2919.f9303, c2919.f9310, c2919.f9311, c2919.f9312));
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
