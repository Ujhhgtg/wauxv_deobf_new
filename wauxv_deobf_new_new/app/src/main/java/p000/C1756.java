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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲀᛸᲈᲇᤝᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1756 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final DecimalFormat f5891 = new DecimalFormat("0", DecimalFormatSymbols.getInstance(Locale.ENGLISH));

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public JSONObject f5892;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public HashSet f5893;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public HashSet f5894;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static void m3648(XmlSerializer xmlSerializer, C2255 c2255) throws IOException {
        String str = c2255.f7338;
        if (str != null) {
            xmlSerializer.startTag("", str);
            for (C2253 c2253 : c2255.f7341) {
                xmlSerializer.attribute("", c2253.f7331, c2253.f7332);
            }
            String str2 = c2255.f7340;
            if (str2 != null) {
                xmlSerializer.text(str2);
            }
        }
        Iterator it = c2255.f7342.iterator();
        while (it.hasNext()) {
            m3648(xmlSerializer, (C2255) it.next());
        }
        if (str != null) {
            xmlSerializer.endTag("", str);
        }
    }

    public final String toString() {
        C2255 c2255 = new C2255(null, "");
        m3650(c2255, this.f5892);
        XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
        StringWriter stringWriter = new StringWriter();
        try {
            xmlSerializerNewSerializer.setOutput(stringWriter);
            xmlSerializerNewSerializer.startDocument("UTF-8", Boolean.TRUE);
            m3648(xmlSerializerNewSerializer, c2255);
            xmlSerializerNewSerializer.endDocument();
            return stringWriter.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m3649(C2255 c2255, String str, JSONArray jSONArray) {
        int length = jSONArray.length();
        String str2 = c2255.f7339 + "/" + str;
        for (int i = 0; i < length; i++) {
            C2255 c2256 = new C2255(str, str2);
            Object objOpt = jSONArray.opt(i);
            if (objOpt != null) {
                if (objOpt instanceof JSONObject) {
                    m3650(c2256, (JSONObject) objOpt);
                } else if (objOpt instanceof JSONArray) {
                    m3649(c2256, str, (JSONArray) objOpt);
                } else {
                    String string = objOpt.toString();
                    c2256.f7338 = str;
                    c2256.f7340 = string;
                }
            }
            c2255.f7342.add(c2256);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m3650(C2255 c2255, JSONObject jSONObject) {
        String string;
        ArrayList arrayList = c2255.f7342;
        String str = c2255.f7339;
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            if (objOpt != null) {
                if (objOpt instanceof JSONObject) {
                    C2255 c2256 = new C2255(next, str + "/" + next);
                    arrayList.add(c2256);
                    m3650(c2256, (JSONObject) objOpt);
                } else if (objOpt instanceof JSONArray) {
                    m3649(c2255, next, (JSONArray) objOpt);
                } else {
                    String str2 = str + "/" + next;
                    if (objOpt instanceof Double) {
                        double dDoubleValue = ((Double) objOpt).doubleValue();
                        if (dDoubleValue % 1.0d == 0.0d) {
                            string = Long.toString((long) dDoubleValue);
                        } else {
                            DecimalFormat decimalFormat = f5891;
                            if (decimalFormat.getMaximumFractionDigits() == 0) {
                                decimalFormat.setMaximumFractionDigits(20);
                            }
                            string = decimalFormat.format(dDoubleValue);
                        }
                    } else {
                        string = objOpt.toString();
                    }
                    if (this.f5893.contains(str2)) {
                        ArrayList arrayList2 = c2255.f7341;
                        C2253 c2253 = new C2253();
                        c2253.f7331 = next;
                        c2253.f7332 = string;
                        arrayList2.add(c2253);
                    } else if (this.f5894.contains(str2)) {
                        c2255.f7340 = string;
                    } else {
                        C2255 c2257 = new C2255(next, str);
                        c2257.f7340 = string;
                        arrayList.add(c2257);
                    }
                }
            }
        }
    }
}
