package p000;

import android.util.Xml;
import java.io.IOException;
import java.io.StringWriter;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛱfeyxiexzfᛱ要点脸能不能ᛳᛴᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0160Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static final DecimalFormat f1332Ujhhgtgfeyxiexzf = new DecimalFormat("0", DecimalFormatSymbols.getInstance(Locale.ENGLISH));

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public JSONObject f1333Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public HashSet f1334Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public HashSet f1335Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static void m1204Ujhhgtgfeyxiexzf(XmlSerializer xmlSerializer, C1287feyxiexzfUjhhgtg c1287feyxiexzfUjhhgtg) throws IOException {
        String str = c1287feyxiexzfUjhhgtg.f4690Ujhhgtgfeyxiexzf;
        if (str != null) {
            xmlSerializer.startTag("", str);
            for (C1285feyxiexzfUjhhgtg c1285feyxiexzfUjhhgtg : c1287feyxiexzfUjhhgtg.f4693Ujhhgtgfeyxiexzf) {
                xmlSerializer.attribute("", c1285feyxiexzfUjhhgtg.f4683Ujhhgtgfeyxiexzf, c1285feyxiexzfUjhhgtg.f4684Ujhhgtgfeyxiexzf);
            }
            String str2 = c1287feyxiexzfUjhhgtg.f4692Ujhhgtgfeyxiexzf;
            if (str2 != null) {
                xmlSerializer.text(str2);
            }
        }
        Iterator it = c1287feyxiexzfUjhhgtg.f4694Ujhhgtgfeyxiexzf.iterator();
        while (it.hasNext()) {
            m1204Ujhhgtgfeyxiexzf(xmlSerializer, (C1287feyxiexzfUjhhgtg) it.next());
        }
        if (str != null) {
            xmlSerializer.endTag("", str);
        }
    }

    public final String toString() {
        C1287feyxiexzfUjhhgtg c1287feyxiexzfUjhhgtg = new C1287feyxiexzfUjhhgtg(null, "");
        m1206Ujhhgtgfeyxiexzf(c1287feyxiexzfUjhhgtg, this.f1333Ujhhgtgfeyxiexzf);
        XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
        StringWriter stringWriter = new StringWriter();
        try {
            xmlSerializerNewSerializer.setOutput(stringWriter);
            xmlSerializerNewSerializer.startDocument("UTF-8", Boolean.TRUE);
            m1204Ujhhgtgfeyxiexzf(xmlSerializerNewSerializer, c1287feyxiexzfUjhhgtg);
            xmlSerializerNewSerializer.endDocument();
            return stringWriter.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void m1205Ujhhgtgfeyxiexzf(C1287feyxiexzfUjhhgtg c1287feyxiexzfUjhhgtg, String str, JSONArray jSONArray) {
        int length = jSONArray.length();
        String str2 = c1287feyxiexzfUjhhgtg.f4691Ujhhgtgfeyxiexzf + "/" + str;
        for (int i = 0; i < length; i++) {
            C1287feyxiexzfUjhhgtg c1287feyxiexzfUjhhgtg2 = new C1287feyxiexzfUjhhgtg(str, str2);
            Object objOpt = jSONArray.opt(i);
            if (objOpt != null) {
                if (objOpt instanceof JSONObject) {
                    m1206Ujhhgtgfeyxiexzf(c1287feyxiexzfUjhhgtg2, (JSONObject) objOpt);
                } else if (objOpt instanceof JSONArray) {
                    m1205Ujhhgtgfeyxiexzf(c1287feyxiexzfUjhhgtg2, str, (JSONArray) objOpt);
                } else {
                    String string = objOpt.toString();
                    c1287feyxiexzfUjhhgtg2.f4690Ujhhgtgfeyxiexzf = str;
                    c1287feyxiexzfUjhhgtg2.f4692Ujhhgtgfeyxiexzf = string;
                }
            }
            c1287feyxiexzfUjhhgtg.f4694Ujhhgtgfeyxiexzf.add(c1287feyxiexzfUjhhgtg2);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final void m1206Ujhhgtgfeyxiexzf(C1287feyxiexzfUjhhgtg c1287feyxiexzfUjhhgtg, JSONObject jSONObject) {
        String string;
        ArrayList arrayList = c1287feyxiexzfUjhhgtg.f4694Ujhhgtgfeyxiexzf;
        String str = c1287feyxiexzfUjhhgtg.f4691Ujhhgtgfeyxiexzf;
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            if (objOpt != null) {
                if (objOpt instanceof JSONObject) {
                    C1287feyxiexzfUjhhgtg c1287feyxiexzfUjhhgtg2 = new C1287feyxiexzfUjhhgtg(next, str + "/" + next);
                    arrayList.add(c1287feyxiexzfUjhhgtg2);
                    m1206Ujhhgtgfeyxiexzf(c1287feyxiexzfUjhhgtg2, (JSONObject) objOpt);
                } else if (objOpt instanceof JSONArray) {
                    m1205Ujhhgtgfeyxiexzf(c1287feyxiexzfUjhhgtg, next, (JSONArray) objOpt);
                } else {
                    String str2 = str + "/" + next;
                    if (objOpt instanceof Double) {
                        double dDoubleValue = ((Double) objOpt).doubleValue();
                        if (dDoubleValue % 1.0d == 0.0d) {
                            string = Long.toString((long) dDoubleValue);
                        } else {
                            DecimalFormat decimalFormat = f1332Ujhhgtgfeyxiexzf;
                            if (decimalFormat.getMaximumFractionDigits() == 0) {
                                decimalFormat.setMaximumFractionDigits(20);
                            }
                            string = decimalFormat.format(dDoubleValue);
                        }
                    } else {
                        string = objOpt.toString();
                    }
                    if (this.f1334Ujhhgtgfeyxiexzf.contains(str2)) {
                        ArrayList arrayList2 = c1287feyxiexzfUjhhgtg.f4693Ujhhgtgfeyxiexzf;
                        C1285feyxiexzfUjhhgtg c1285feyxiexzfUjhhgtg = new C1285feyxiexzfUjhhgtg();
                        c1285feyxiexzfUjhhgtg.f4683Ujhhgtgfeyxiexzf = next;
                        c1285feyxiexzfUjhhgtg.f4684Ujhhgtgfeyxiexzf = string;
                        arrayList2.add(c1285feyxiexzfUjhhgtg);
                    } else if (this.f1335Ujhhgtgfeyxiexzf.contains(str2)) {
                        c1287feyxiexzfUjhhgtg.f4692Ujhhgtgfeyxiexzf = string;
                    } else {
                        C1287feyxiexzfUjhhgtg c1287feyxiexzfUjhhgtg3 = new C1287feyxiexzfUjhhgtg(next, str);
                        c1287feyxiexzfUjhhgtg3.f4692Ujhhgtgfeyxiexzf = string;
                        arrayList.add(c1287feyxiexzfUjhhgtg3);
                    }
                }
            }
        }
    }
}
