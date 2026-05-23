package p000;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.util.Xml;
import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import me.hd.wauxv.hook.factory.MagicFactory;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᤝᛸᤞᲇᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2834 {
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final String m4817(String str) {
        String[] strArr = AbstractC1574.f5469;
        return AbstractC2841.m4848(AbstractC2849.m4857(AbstractC2849.m4857(AbstractC2849.m4857(AbstractC2849.m4857(str, "\r", ""), "\n", ""), "\t", ""), "<?xml version=\"1.0\"?>", "")).toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final void m4818(Context context, String str) {
        String[] strArr = AbstractC1574.f5469;
        Object systemService = context.getSystemService("clipboard");
        "null cannot be cast to non-null type android.content.ClipboardManager";
        ClipboardManager clipboardManager = (ClipboardManager) systemService;
        ClipData clipDataNewPlainText = ClipData.newPlainText("label", str);
        if (clipDataNewPlainText != null) {
            clipboardManager.setPrimaryClip(clipDataNewPlainText);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static /* synthetic */ void m4819(String str) {
        C1565.f5440.getClass();
        m4818(C1565.m3276(), str);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final boolean m4820(String str) {
        if (AbstractC2841.m4836(str)) {
            return false;
        }
        try {
            XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
            xmlPullParserNewPullParser.setInput(new StringReader(str));
            while (xmlPullParserNewPullParser.getEventType() != 1) {
                xmlPullParserNewPullParser.next();
            }
            return true;
        } catch (IOException | XmlPullParserException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final JSONObject m4821(String str) {
        org.json.JSONObject jSONObjectM3873;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        StringReader stringReader = new StringReader(str);
        C2014 c2014 = new C2014();
        c2014.f6715 = new HashSet();
        c2014.f6719 = new HashSet();
        new HashSet();
        c2014.f6714 = hashSet;
        c2014.f6715 = hashSet2;
        c2014.f6716 = map;
        c2014.f6717 = map2;
        c2014.f6718 = map3;
        c2014.f6719 = hashSet3;
        c2014.f6720 = hashSet4;
        try {
            try {
                C2892 c2892 = new C2892("", "xml");
                XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
                xmlPullParserFactoryNewInstance.setNamespaceAware(false);
                XmlPullParser xmlPullParserNewPullParser = xmlPullParserFactoryNewInstance.newPullParser();
                try {
                    xmlPullParserNewPullParser.setInput(stringReader);
                } catch (XmlPullParserException e) {
                    e.printStackTrace();
                }
                for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 0; eventType = xmlPullParserNewPullParser.next()) {
                }
                c2014.m3875(c2892, xmlPullParserNewPullParser);
                stringReader.close();
                jSONObjectM3873 = c2014.m3873(c2892);
            } catch (IOException e2) {
                e = e2;
                e.printStackTrace();
                jSONObjectM3873 = null;
            }
        } catch (XmlPullParserException e3) {
            e = e3;
            e.printStackTrace();
            jSONObjectM3873 = null;
        }
        c2014.f6721 = jSONObjectM3873;
        JSONObject object = JSON.parseObject(String.valueOf(jSONObjectM3873));
        m4822(object);
        return object;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final JSONObject m4822(JSONObject jSONObject) {
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                String str = (String) value;
                if (m4820(str)) {
                    jSONObject.put(key, m4821(str));
                }
            } else if (value instanceof JSONObject) {
                JSONObject jSONObject2 = (JSONObject) value;
                m4822(jSONObject2);
                jSONObject.put(key, jSONObject2);
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static void m4823(Context context, int i, String str) {
        if ((i & 1) != 0) {
            C1565.f5440.getClass();
            context = C1565.m3276();
        }
        AbstractC1458.m3166(str, new C0055(8, context));
    }
}
