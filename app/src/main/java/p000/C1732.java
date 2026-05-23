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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲀᛸᤝᲈᲇᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1732 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final DecimalFormat f5828 = new DecimalFormat("0", DecimalFormatSymbols.getInstance(Locale.ENGLISH));

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public JSONObject f5829;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public HashSet f5830;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public HashSet f5831;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static void m3480(XmlSerializer xmlSerializer, C2223 c2223) throws IOException {
        String str = c2223.f7213;
        if (str != null) {
            xmlSerializer.startTag("", str);
            for (C2222 c2222 : c2223.f7216) {
                xmlSerializer.attribute("", c2222.f7211, c2222.f7212);
            }
            String str2 = c2223.f7215;
            if (str2 != null) {
                xmlSerializer.text(str2);
            }
        }
        Iterator it = c2223.f7217.iterator();
        while (it.hasNext()) {
            m3480(xmlSerializer, (C2223) it.next());
        }
        if (str != null) {
            xmlSerializer.endTag("", str);
        }
    }

    public final String toString() {
        C2223 c2223 = new C2223(null, "");
        m3482(c2223, this.f5829);
        XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
        StringWriter stringWriter = new StringWriter();
        try {
            xmlSerializerNewSerializer.setOutput(stringWriter);
            xmlSerializerNewSerializer.startDocument("UTF-8", Boolean.TRUE);
            m3480(xmlSerializerNewSerializer, c2223);
            xmlSerializerNewSerializer.endDocument();
            return stringWriter.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m3481(C2223 c2223, String str, JSONArray jSONArray) {
        int length = jSONArray.length();
        String str2 = c2223.f7214 + "/" + str;
        for (int i = 0; i < length; i++) {
            C2223 c2224 = new C2223(str, str2);
            Object objOpt = jSONArray.opt(i);
            if (objOpt != null) {
                if (objOpt instanceof JSONObject) {
                    m3482(c2224, (JSONObject) objOpt);
                } else if (objOpt instanceof JSONArray) {
                    m3481(c2224, str, (JSONArray) objOpt);
                } else {
                    String string = objOpt.toString();
                    c2224.f7213 = str;
                    c2224.f7215 = string;
                }
            }
            c2223.f7217.add(c2224);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m3482(C2223 c2223, JSONObject jSONObject) {
        String string;
        ArrayList arrayList = c2223.f7217;
        String str = c2223.f7214;
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            if (objOpt != null) {
                if (objOpt instanceof JSONObject) {
                    C2223 c2224 = new C2223(next, str + "/" + next);
                    arrayList.add(c2224);
                    m3482(c2224, (JSONObject) objOpt);
                } else if (objOpt instanceof JSONArray) {
                    m3481(c2223, next, (JSONArray) objOpt);
                } else {
                    String str2 = str + "/" + next;
                    if (objOpt instanceof Double) {
                        double dDoubleValue = ((Double) objOpt).doubleValue();
                        if (dDoubleValue % 1.0d == 0.0d) {
                            string = Long.toString((long) dDoubleValue);
                        } else {
                            DecimalFormat decimalFormat = f5828;
                            if (decimalFormat.getMaximumFractionDigits() == 0) {
                                decimalFormat.setMaximumFractionDigits(20);
                            }
                            string = decimalFormat.format(dDoubleValue);
                        }
                    } else {
                        string = objOpt.toString();
                    }
                    if (this.f5830.contains(str2)) {
                        ArrayList arrayList2 = c2223.f7216;
                        C2222 c2222 = new C2222();
                        c2222.f7211 = next;
                        c2222.f7212 = string;
                        arrayList2.add(c2222);
                    } else if (this.f5831.contains(str2)) {
                        c2223.f7215 = string;
                    } else {
                        C2223 c2225 = new C2223(next, str);
                        c2225.f7215 = string;
                        arrayList.add(c2225);
                    }
                }
            }
        }
    }
}
