package p000;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲇᛸᲁᲀᤝᤞᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3740 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public HashSet f11701;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public HashSet f11702;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public HashMap f11703;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public HashMap f11704;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public HashMap f11705;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public HashSet f11706;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public HashSet f11707;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public JSONObject f11708;

    public final String toString() {
        JSONObject jSONObject = this.f11708;
        if (jSONObject != null) {
            return jSONObject.toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final JSONObject m5311(C2951 c2951) {
        JSONObject jSONObject = new JSONObject();
        if (c2951.f9476 != null) {
            String str = c2951.f9473;
            String str2 = (String) this.f11704.get(str);
            if (str2 == null) {
                str2 = "content";
            }
            m5312(str, jSONObject, str2, c2951.f9476);
        }
        try {
            HashMap map = new HashMap();
            for (C2951 c2952 : c2951.f9475) {
                String str3 = c2952.f9474;
                ArrayList arrayList = (ArrayList) map.get(str3);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map.put(str3, arrayList);
                }
                arrayList.add(c2952);
            }
            for (ArrayList arrayList2 : map.values()) {
                if (arrayList2.size() == 1) {
                    C2951 c2953 = (C2951) arrayList2.get(0);
                    String str4 = c2953.f9473;
                    String str5 = c2953.f9474;
                    if (!this.f11701.contains(str4)) {
                        Iterator it = this.f11702.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                if (c2953.f9475.size() <= 0) {
                                    m5312(c2953.f9473, jSONObject, str5, c2953.f9476);
                                    break;
                                }
                                jSONObject.put(str5, m5311(c2953));
                                break;
                            }
                            if (((Pattern) it.next()).matcher(str4).find()) {
                            }
                        }
                    }
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(m5311(c2953));
                    jSONObject.put(str5, jSONArray);
                    break;
                }
                JSONArray jSONArray2 = new JSONArray();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    jSONArray2.put(m5311((C2951) it2.next()));
                }
                jSONObject.put(((C2951) arrayList2.get(0)).f9474, jSONArray2);
            }
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m5312(String str, JSONObject jSONObject, String str2, String str3) {
        try {
            Class cls = (Class) this.f11705.get(str);
            if (cls == null) {
                if (str3 == null) {
                    str3 = "";
                }
                jSONObject.put(str2, str3);
            } else if (cls == Integer.class) {
                try {
                    jSONObject.put(str2, Integer.valueOf(Integer.parseInt(str3)));
                } catch (NumberFormatException unused) {
                    jSONObject.put(str2, 0);
                }
            } else if (cls == Long.class) {
                try {
                    jSONObject.put(str2, Long.valueOf(Long.parseLong(str3)));
                } catch (NumberFormatException unused2) {
                    jSONObject.put(str2, 0L);
                }
            } else if (cls == Double.class) {
                try {
                    jSONObject.put(str2, Double.valueOf(Double.parseDouble(str3)));
                } catch (NumberFormatException unused3) {
                    jSONObject.put(str2, 0.0d);
                }
            } else if (cls == Boolean.class) {
                if (str3 == null) {
                    jSONObject.put(str2, false);
                } else if (str3.equalsIgnoreCase("true")) {
                    jSONObject.put(str2, true);
                } else if (str3.equalsIgnoreCase("false")) {
                    jSONObject.put(str2, false);
                } else {
                    jSONObject.put(str2, false);
                }
            }
        } catch (JSONException unused4) {
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m5313(C2951 c2951, XmlPullParser xmlPullParser) {
        int next;
        String str = c2951.f9473;
        do {
            try {
                next = xmlPullParser.next();
                if (next == 2) {
                    String name = xmlPullParser.getName();
                    String str2 = str + "/" + name;
                    boolean zContains = this.f11707.contains(str2);
                    C2951 c2952 = new C2951(str2, name);
                    if (!zContains) {
                        c2951.f9475.add(c2952);
                    }
                    int attributeCount = xmlPullParser.getAttributeCount();
                    for (int i = 0; i < attributeCount; i++) {
                        String attributeName = xmlPullParser.getAttributeName(i);
                        String attributeValue = xmlPullParser.getAttributeValue(i);
                        String str3 = str + "/" + c2952.f9474 + "/" + attributeName;
                        if (!this.f11706.contains(str3)) {
                            String str4 = (String) this.f11703.get(str3);
                            if (str4 != null) {
                                attributeName = str4;
                            }
                            C2951 c2953 = new C2951(str3, attributeName);
                            c2953.m4961(attributeValue);
                            c2952.f9475.add(c2953);
                        }
                    }
                    m5313(c2952, xmlPullParser);
                } else {
                    if (next != 4) {
                        if (next != 3 && next != 1) {
                            Log.i("XmlToJson", "unknown xml eventType " + next);
                        }
                        return;
                    }
                    c2951.m4961(xmlPullParser.getText());
                }
            } catch (IOException e) {
                e = e;
                e.printStackTrace();
                return;
            } catch (NullPointerException e2) {
                e = e2;
                e.printStackTrace();
                return;
            } catch (XmlPullParserException e3) {
                e = e3;
                e.printStackTrace();
                return;
            }
        } while (next != 1);
    }
}
