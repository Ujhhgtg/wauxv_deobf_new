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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᲁᤝᛸᤞᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2894 {
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final String m4850(String str) {
        String[] strArr = AbstractC1471.f5234;
        return AbstractC2901.m4882(AbstractC2909.m4918(AbstractC2909.m4918(AbstractC2909.m4918(AbstractC2909.m4918(str, "\r", ""), "\n", ""), "\t", ""), "<?xml version=\"1.0\"?>", "")).toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final void m4851(Context context, String str) {
        String[] strArr = AbstractC1471.f5234;
        Object systemService = context.getSystemService("clipboard");
        "null cannot be cast to non-null type android.content.ClipboardManager";
        ClipboardManager clipboardManager = (ClipboardManager) systemService;
        ClipData clipDataNewPlainText = ClipData.newPlainText("label", str);
        if (clipDataNewPlainText != null) {
            clipboardManager.setPrimaryClip(clipDataNewPlainText);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static /* synthetic */ void m4852(String str) {
        C1576.f5470.getClass();
        m4851(C1576.m3456(), str);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final boolean m4853(String str) {
        if (AbstractC2901.m4869(str)) {
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
    public static final JSONObject m4854(String str) {
        org.json.JSONObject jSONObjectM5311;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        StringReader stringReader = new StringReader(str);
        C3740 c3740 = new C3740();
        c3740.f11702 = new HashSet();
        c3740.f11706 = new HashSet();
        new HashSet();
        c3740.f11701 = hashSet;
        c3740.f11702 = hashSet2;
        c3740.f11703 = map;
        c3740.f11704 = map2;
        c3740.f11705 = map3;
        c3740.f11706 = hashSet3;
        c3740.f11707 = hashSet4;
        try {
            try {
                C2951 c2951 = new C2951("", "xml");
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
                c3740.m5313(c2951, xmlPullParserNewPullParser);
                stringReader.close();
                jSONObjectM5311 = c3740.m5311(c2951);
            } catch (IOException e2) {
                e = e2;
                e.printStackTrace();
                jSONObjectM5311 = null;
            }
        } catch (XmlPullParserException e3) {
            e = e3;
            e.printStackTrace();
            jSONObjectM5311 = null;
        }
        c3740.f11708 = jSONObjectM5311;
        JSONObject object = JSON.parseObject(String.valueOf(jSONObjectM5311));
        m4855(object);
        return object;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final JSONObject m4855(JSONObject jSONObject) {
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                String str = (String) value;
                if (m4853(str)) {
                    jSONObject.put(key, m4854(str));
                }
            } else if (value instanceof JSONObject) {
                JSONObject jSONObject2 = (JSONObject) value;
                m4855(jSONObject2);
                jSONObject.put(key, jSONObject2);
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static void m4856(Context context, int i, String str) {
        if ((i & 1) != 0) {
            C1576.f5470.getClass();
            context = C1576.m3456();
        }
        C1787.m3673(str, new C0062(context, 11));
    }
}
