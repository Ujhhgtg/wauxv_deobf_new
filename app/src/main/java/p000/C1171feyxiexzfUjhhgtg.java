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

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛴᛳᛱUjhhgtgᛱᛲ要点脸能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1171feyxiexzfUjhhgtg extends MenuInflater {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static final Class[] f4444Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static final Class[] f4445Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final Object[] f4446Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Object[] f4447Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final Context f4448Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public Object f4449Ujhhgtgfeyxiexzf;

    static {
        Class[] clsArr = {Context.class};
        f4444Ujhhgtgfeyxiexzf = clsArr;
        f4445Ujhhgtgfeyxiexzf = clsArr;
    }

    public C1171feyxiexzfUjhhgtg(Context context) {
        super(context);
        this.f4448Ujhhgtgfeyxiexzf = context;
        Object[] objArr = {context};
        this.f4446Ujhhgtgfeyxiexzf = objArr;
        this.f4447Ujhhgtgfeyxiexzf = objArr;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static Object m2661Ujhhgtgfeyxiexzf(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m2661Ujhhgtgfeyxiexzf(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof MenuC0355Ujhhgtgfeyxiexzf)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z = false;
        try {
            try {
                layout = this.f4448Ujhhgtgfeyxiexzf.getResources().getLayout(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof MenuC0355Ujhhgtgfeyxiexzf) {
                    MenuC0355Ujhhgtgfeyxiexzf menuC0355Ujhhgtgfeyxiexzf = (MenuC0355Ujhhgtgfeyxiexzf) menu;
                    if (!menuC0355Ujhhgtgfeyxiexzf.f2016Ujhhgtgfeyxiexzf) {
                        menuC0355Ujhhgtgfeyxiexzf.m1560Ujhhgtgfeyxiexzf();
                        z = true;
                    }
                }
                m2662Ujhhgtgfeyxiexzf(layout, attributeSetAsAttributeSet, menu);
                if (z) {
                    ((MenuC0355Ujhhgtgfeyxiexzf) menu).m1559Ujhhgtgfeyxiexzf();
                }
                layout.close();
            } catch (IOException e) {
                throw new InflateException("Error inflating menu XML", e);
            } catch (XmlPullParserException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } catch (Throwable th) {
            if (z) {
                ((MenuC0355Ujhhgtgfeyxiexzf) menu).m1559Ujhhgtgfeyxiexzf();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void m2662Ujhhgtgfeyxiexzf(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i;
        ColorStateList colorStateList;
        int resourceId;
        C1170feyxiexzfUjhhgtg c1170feyxiexzfUjhhgtg = new C1170feyxiexzfUjhhgtg(this, menu);
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
                    Context context = this.f4448Ujhhgtgfeyxiexzf;
                    if (zEquals) {
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0801feyxiexzfUjhhgtg.f3170Ujhhgtgfeyxiexzf);
                        c1170feyxiexzfUjhhgtg.f4415Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                        c1170feyxiexzfUjhhgtg.f4416Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getInt(3, 0);
                        c1170feyxiexzfUjhhgtg.f4417Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getInt(4, 0);
                        c1170feyxiexzfUjhhgtg.f4418Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getInt(5, 0);
                        c1170feyxiexzfUjhhgtg.f4419Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getBoolean(2, true);
                        c1170feyxiexzfUjhhgtg.f4420Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                    } else if (name2.equals("item")) {
                        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0801feyxiexzfUjhhgtg.f3171Ujhhgtgfeyxiexzf);
                        c1170feyxiexzfUjhhgtg.f4422Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes2.getResourceId(2, 0);
                        c1170feyxiexzfUjhhgtg.f4423Ujhhgtgfeyxiexzf = (typedArrayObtainStyledAttributes2.getInt(5, c1170feyxiexzfUjhhgtg.f4416Ujhhgtgfeyxiexzf) & (-65536)) | (typedArrayObtainStyledAttributes2.getInt(6, c1170feyxiexzfUjhhgtg.f4417Ujhhgtgfeyxiexzf) & Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        c1170feyxiexzfUjhhgtg.f4424Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes2.getText(7);
                        c1170feyxiexzfUjhhgtg.f4425Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes2.getText(8);
                        c1170feyxiexzfUjhhgtg.f4426Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                        String string = typedArrayObtainStyledAttributes2.getString(9);
                        c1170feyxiexzfUjhhgtg.f4427Ujhhgtgfeyxiexzf = string == null ? (char) 0 : string.charAt(0);
                        c1170feyxiexzfUjhhgtg.f4428Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes2.getInt(16, 4096);
                        String string2 = typedArrayObtainStyledAttributes2.getString(10);
                        c1170feyxiexzfUjhhgtg.f4429Ujhhgtgfeyxiexzf = string2 == null ? (char) 0 : string2.charAt(0);
                        c1170feyxiexzfUjhhgtg.f4430Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes2.getInt(20, 4096);
                        if (typedArrayObtainStyledAttributes2.hasValue(11)) {
                            c1170feyxiexzfUjhhgtg.f4431Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                        } else {
                            c1170feyxiexzfUjhhgtg.f4431Ujhhgtgfeyxiexzf = c1170feyxiexzfUjhhgtg.f4418Ujhhgtgfeyxiexzf;
                        }
                        c1170feyxiexzfUjhhgtg.f4432Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes2.getBoolean(3, false);
                        c1170feyxiexzfUjhhgtg.f4433Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes2.getBoolean(4, c1170feyxiexzfUjhhgtg.f4419Ujhhgtgfeyxiexzf);
                        c1170feyxiexzfUjhhgtg.f4434Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes2.getBoolean(1, c1170feyxiexzfUjhhgtg.f4420Ujhhgtgfeyxiexzf);
                        c1170feyxiexzfUjhhgtg.f4435Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes2.getInt(21, -1);
                        c1170feyxiexzfUjhhgtg.f4438feyxiexzfUjhhgtg = typedArrayObtainStyledAttributes2.getString(12);
                        c1170feyxiexzfUjhhgtg.f4436Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes2.getResourceId(13, 0);
                        c1170feyxiexzfUjhhgtg.f4437Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes2.getString(15);
                        String string3 = typedArrayObtainStyledAttributes2.getString(14);
                        boolean z3 = string3 != null;
                        if (z3 && c1170feyxiexzfUjhhgtg.f4436Ujhhgtgfeyxiexzf == 0 && c1170feyxiexzfUjhhgtg.f4437Ujhhgtgfeyxiexzf == null) {
                            if (c1170feyxiexzfUjhhgtg.m2659Ujhhgtgfeyxiexzf(string3, f4445Ujhhgtgfeyxiexzf, this.f4447Ujhhgtgfeyxiexzf) != null) {
                                throw new ClassCastException();
                            }
                        } else if (z3) {
                            Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                        }
                        c1170feyxiexzfUjhhgtg.f4439feyxiexzfUjhhgtg = typedArrayObtainStyledAttributes2.getText(17);
                        c1170feyxiexzfUjhhgtg.f4440feyxiexzfUjhhgtg = typedArrayObtainStyledAttributes2.getText(22);
                        if (typedArrayObtainStyledAttributes2.hasValue(19)) {
                            c1170feyxiexzfUjhhgtg.f4442feyxiexzfUjhhgtg = AbstractC3252feyxiexzfUjhhgtg.m4758Ujhhgtgfeyxiexzf(typedArrayObtainStyledAttributes2.getInt(19, -1), c1170feyxiexzfUjhhgtg.f4442feyxiexzfUjhhgtg);
                        } else {
                            c1170feyxiexzfUjhhgtg.f4442feyxiexzfUjhhgtg = null;
                        }
                        if (typedArrayObtainStyledAttributes2.hasValue(18)) {
                            if (!typedArrayObtainStyledAttributes2.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = AbstractC3085Ujhhgtgfeyxiexzf.m4559Ujhhgtgfeyxiexzf(context, resourceId)) == null) {
                                colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(18);
                            }
                            c1170feyxiexzfUjhhgtg.f4441feyxiexzfUjhhgtg = colorStateList;
                        } else {
                            c1170feyxiexzfUjhhgtg.f4441feyxiexzfUjhhgtg = null;
                        }
                        typedArrayObtainStyledAttributes2.recycle();
                        c1170feyxiexzfUjhhgtg.f4421Ujhhgtgfeyxiexzf = false;
                        xmlPullParser = xmlPullParser;
                    } else if (name2.equals("menu")) {
                        c1170feyxiexzfUjhhgtg.f4421Ujhhgtgfeyxiexzf = true;
                        SubMenu subMenuAddSubMenu = c1170feyxiexzfUjhhgtg.f4414Ujhhgtgfeyxiexzf.addSubMenu(c1170feyxiexzfUjhhgtg.f4415Ujhhgtgfeyxiexzf, c1170feyxiexzfUjhhgtg.f4422Ujhhgtgfeyxiexzf, c1170feyxiexzfUjhhgtg.f4423Ujhhgtgfeyxiexzf, c1170feyxiexzfUjhhgtg.f4424Ujhhgtgfeyxiexzf);
                        c1170feyxiexzfUjhhgtg.m2660Ujhhgtgfeyxiexzf(subMenuAddSubMenu.getItem());
                        xmlPullParser = xmlPullParser;
                        m2662Ujhhgtgfeyxiexzf(xmlPullParser, attributeSet, subMenuAddSubMenu);
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
                        c1170feyxiexzfUjhhgtg.f4415Ujhhgtgfeyxiexzf = 0;
                        c1170feyxiexzfUjhhgtg.f4416Ujhhgtgfeyxiexzf = 0;
                        c1170feyxiexzfUjhhgtg.f4417Ujhhgtgfeyxiexzf = 0;
                        c1170feyxiexzfUjhhgtg.f4418Ujhhgtgfeyxiexzf = 0;
                        c1170feyxiexzfUjhhgtg.f4419Ujhhgtgfeyxiexzf = true;
                        c1170feyxiexzfUjhhgtg.f4420Ujhhgtgfeyxiexzf = true;
                    } else if (name3.equals("item")) {
                        if (!c1170feyxiexzfUjhhgtg.f4421Ujhhgtgfeyxiexzf) {
                            c1170feyxiexzfUjhhgtg.f4421Ujhhgtgfeyxiexzf = true;
                            c1170feyxiexzfUjhhgtg.m2660Ujhhgtgfeyxiexzf(c1170feyxiexzfUjhhgtg.f4414Ujhhgtgfeyxiexzf.add(c1170feyxiexzfUjhhgtg.f4415Ujhhgtgfeyxiexzf, c1170feyxiexzfUjhhgtg.f4422Ujhhgtgfeyxiexzf, c1170feyxiexzfUjhhgtg.f4423Ujhhgtgfeyxiexzf, c1170feyxiexzfUjhhgtg.f4424Ujhhgtgfeyxiexzf));
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
