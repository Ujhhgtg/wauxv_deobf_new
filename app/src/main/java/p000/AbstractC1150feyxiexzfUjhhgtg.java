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

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛴᛲᛱUjhhgtgᛱ要点脸ᛳ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1150feyxiexzfUjhhgtg {
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final String m2615Ujhhgtgfeyxiexzf(String str) {
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        return AbstractC1152feyxiexzfUjhhgtg.m2644feyxiexzfUjhhgtg(AbstractC1192feyxiexzfUjhhgtg.m2681feyxiexzfUjhhgtg(AbstractC1192feyxiexzfUjhhgtg.m2681feyxiexzfUjhhgtg(AbstractC1192feyxiexzfUjhhgtg.m2681feyxiexzfUjhhgtg(AbstractC1192feyxiexzfUjhhgtg.m2681feyxiexzfUjhhgtg(str, MagicFactory.get(4928238864922838410L, strArr), MagicFactory.get(4928238856332903818L, strArr)), MagicFactory.get(4928238852037936522L, strArr), MagicFactory.get(4928238980886955402L, strArr)), MagicFactory.get(4928238976591988106L, strArr), MagicFactory.get(4928238968002053514L, strArr)), MagicFactory.get(4928238963707086218L, strArr), MagicFactory.get(4928239006656759178L, strArr))).toString();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final void m2616Ujhhgtgfeyxiexzf(Context context, String str) {
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        Object systemService = context.getSystemService(MagicFactory.get(4928239646606886282L, strArr));
        MagicFactory.get(4928239741096166794L, strArr);
        ClipboardManager clipboardManager = (ClipboardManager) systemService;
        ClipData clipDataNewPlainText = ClipData.newPlainText(MagicFactory.get(4928238890692642186L, strArr), str);
        if (clipDataNewPlainText != null) {
            clipboardManager.setPrimaryClip(clipDataNewPlainText);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static /* synthetic */ void m2617Ujhhgtgfeyxiexzf(String str) {
        C0580Ujhhgtgfeyxiexzf.f2600Ujhhgtgfeyxiexzf.getClass();
        m2616Ujhhgtgfeyxiexzf(C0580Ujhhgtgfeyxiexzf.m1855Ujhhgtgfeyxiexzf(), str);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static final boolean m2618Ujhhgtgfeyxiexzf(String str) {
        if (AbstractC1152feyxiexzfUjhhgtg.m2631feyxiexzfUjhhgtg(str)) {
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

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static final JSONObject m2619Ujhhgtgfeyxiexzf(String str) {
        org.json.JSONObject jSONObjectM3491Ujhhgtgfeyxiexzf;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        StringReader stringReader = new StringReader(str);
        C2289feyxiexzfUjhhgtg c2289feyxiexzfUjhhgtg = new C2289feyxiexzfUjhhgtg();
        c2289feyxiexzfUjhhgtg.f7504Ujhhgtgfeyxiexzf = new HashSet();
        c2289feyxiexzfUjhhgtg.f7508Ujhhgtgfeyxiexzf = new HashSet();
        new HashSet();
        c2289feyxiexzfUjhhgtg.f7503Ujhhgtgfeyxiexzf = hashSet;
        c2289feyxiexzfUjhhgtg.f7504Ujhhgtgfeyxiexzf = hashSet2;
        c2289feyxiexzfUjhhgtg.f7505Ujhhgtgfeyxiexzf = map;
        c2289feyxiexzfUjhhgtg.f7506Ujhhgtgfeyxiexzf = map2;
        c2289feyxiexzfUjhhgtg.f7507Ujhhgtgfeyxiexzf = map3;
        c2289feyxiexzfUjhhgtg.f7508Ujhhgtgfeyxiexzf = hashSet3;
        c2289feyxiexzfUjhhgtg.f7509Ujhhgtgfeyxiexzf = hashSet4;
        try {
            try {
                C1982Ujhhgtgfeyxiexzf c1982Ujhhgtgfeyxiexzf = new C1982Ujhhgtgfeyxiexzf("", "xml");
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
                c2289feyxiexzfUjhhgtg.m3493Ujhhgtgfeyxiexzf(c1982Ujhhgtgfeyxiexzf, xmlPullParserNewPullParser);
                stringReader.close();
                jSONObjectM3491Ujhhgtgfeyxiexzf = c2289feyxiexzfUjhhgtg.m3491Ujhhgtgfeyxiexzf(c1982Ujhhgtgfeyxiexzf);
            } catch (IOException e2) {
                e = e2;
                e.printStackTrace();
                jSONObjectM3491Ujhhgtgfeyxiexzf = null;
            }
        } catch (XmlPullParserException e3) {
            e = e3;
            e.printStackTrace();
            jSONObjectM3491Ujhhgtgfeyxiexzf = null;
        }
        c2289feyxiexzfUjhhgtg.f7510Ujhhgtgfeyxiexzf = jSONObjectM3491Ujhhgtgfeyxiexzf;
        JSONObject object = JSON.parseObject(String.valueOf(jSONObjectM3491Ujhhgtgfeyxiexzf));
        m2620Ujhhgtgfeyxiexzf(object);
        return object;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static final JSONObject m2620Ujhhgtgfeyxiexzf(JSONObject jSONObject) {
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                String str = (String) value;
                if (m2618Ujhhgtgfeyxiexzf(str)) {
                    jSONObject.put(key, m2619Ujhhgtgfeyxiexzf(str));
                }
            } else if (value instanceof JSONObject) {
                JSONObject jSONObject2 = (JSONObject) value;
                m2620Ujhhgtgfeyxiexzf(jSONObject2);
                jSONObject.put(key, jSONObject2);
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static void m2621Ujhhgtgfeyxiexzf(Context context, int i, String str) {
        if ((i & 1) != 0) {
            C0580Ujhhgtgfeyxiexzf.f2600Ujhhgtgfeyxiexzf.getClass();
            context = C0580Ujhhgtgfeyxiexzf.m1855Ujhhgtgfeyxiexzf();
        }
        AbstractC0615Ujhhgtgfeyxiexzf.m1889Ujhhgtgfeyxiexzf(str, new C2925Ujhhgtgfeyxiexzf(11, context));
    }
}
