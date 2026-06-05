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

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛳ能不能ᛴ要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2289feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public HashSet f7503Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public HashSet f7504Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public HashMap f7505Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public HashMap f7506Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public HashMap f7507Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public HashSet f7508Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public HashSet f7509Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public JSONObject f7510Ujhhgtgfeyxiexzf;

    public final String toString() {
        JSONObject jSONObject = this.f7510Ujhhgtgfeyxiexzf;
        if (jSONObject != null) {
            return jSONObject.toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final JSONObject m3491Ujhhgtgfeyxiexzf(C1982Ujhhgtgfeyxiexzf c1982Ujhhgtgfeyxiexzf) {
        JSONObject jSONObject = new JSONObject();
        if (c1982Ujhhgtgfeyxiexzf.f6548Ujhhgtgfeyxiexzf != null) {
            String str = c1982Ujhhgtgfeyxiexzf.f6545Ujhhgtgfeyxiexzf;
            String str2 = (String) this.f7506Ujhhgtgfeyxiexzf.get(str);
            if (str2 == null) {
                str2 = "content";
            }
            m3492Ujhhgtgfeyxiexzf(str, jSONObject, str2, c1982Ujhhgtgfeyxiexzf.f6548Ujhhgtgfeyxiexzf);
        }
        try {
            HashMap map = new HashMap();
            for (C1982Ujhhgtgfeyxiexzf c1982Ujhhgtgfeyxiexzf2 : c1982Ujhhgtgfeyxiexzf.f6547Ujhhgtgfeyxiexzf) {
                String str3 = c1982Ujhhgtgfeyxiexzf2.f6546Ujhhgtgfeyxiexzf;
                ArrayList arrayList = (ArrayList) map.get(str3);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map.put(str3, arrayList);
                }
                arrayList.add(c1982Ujhhgtgfeyxiexzf2);
            }
            for (ArrayList arrayList2 : map.values()) {
                if (arrayList2.size() == 1) {
                    C1982Ujhhgtgfeyxiexzf c1982Ujhhgtgfeyxiexzf3 = (C1982Ujhhgtgfeyxiexzf) arrayList2.get(0);
                    String str4 = c1982Ujhhgtgfeyxiexzf3.f6545Ujhhgtgfeyxiexzf;
                    String str5 = c1982Ujhhgtgfeyxiexzf3.f6546Ujhhgtgfeyxiexzf;
                    if (!this.f7503Ujhhgtgfeyxiexzf.contains(str4)) {
                        Iterator it = this.f7504Ujhhgtgfeyxiexzf.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                if (c1982Ujhhgtgfeyxiexzf3.f6547Ujhhgtgfeyxiexzf.size() <= 0) {
                                    m3492Ujhhgtgfeyxiexzf(c1982Ujhhgtgfeyxiexzf3.f6545Ujhhgtgfeyxiexzf, jSONObject, str5, c1982Ujhhgtgfeyxiexzf3.f6548Ujhhgtgfeyxiexzf);
                                    break;
                                }
                                jSONObject.put(str5, m3491Ujhhgtgfeyxiexzf(c1982Ujhhgtgfeyxiexzf3));
                                break;
                            }
                            if (((Pattern) it.next()).matcher(str4).find()) {
                            }
                        }
                    }
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(m3491Ujhhgtgfeyxiexzf(c1982Ujhhgtgfeyxiexzf3));
                    jSONObject.put(str5, jSONArray);
                    break;
                }
                JSONArray jSONArray2 = new JSONArray();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    jSONArray2.put(m3491Ujhhgtgfeyxiexzf((C1982Ujhhgtgfeyxiexzf) it2.next()));
                }
                jSONObject.put(((C1982Ujhhgtgfeyxiexzf) arrayList2.get(0)).f6546Ujhhgtgfeyxiexzf, jSONArray2);
            }
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void m3492Ujhhgtgfeyxiexzf(String str, JSONObject jSONObject, String str2, String str3) {
        try {
            Class cls = (Class) this.f7507Ujhhgtgfeyxiexzf.get(str);
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

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final void m3493Ujhhgtgfeyxiexzf(C1982Ujhhgtgfeyxiexzf c1982Ujhhgtgfeyxiexzf, XmlPullParser xmlPullParser) {
        int next;
        String str = c1982Ujhhgtgfeyxiexzf.f6545Ujhhgtgfeyxiexzf;
        do {
            try {
                next = xmlPullParser.next();
                if (next == 2) {
                    String name = xmlPullParser.getName();
                    String str2 = str + "/" + name;
                    boolean zContains = this.f7509Ujhhgtgfeyxiexzf.contains(str2);
                    C1982Ujhhgtgfeyxiexzf c1982Ujhhgtgfeyxiexzf2 = new C1982Ujhhgtgfeyxiexzf(str2, name);
                    if (!zContains) {
                        c1982Ujhhgtgfeyxiexzf.f6547Ujhhgtgfeyxiexzf.add(c1982Ujhhgtgfeyxiexzf2);
                    }
                    int attributeCount = xmlPullParser.getAttributeCount();
                    for (int i = 0; i < attributeCount; i++) {
                        String attributeName = xmlPullParser.getAttributeName(i);
                        String attributeValue = xmlPullParser.getAttributeValue(i);
                        String str3 = str + "/" + c1982Ujhhgtgfeyxiexzf2.f6546Ujhhgtgfeyxiexzf + "/" + attributeName;
                        if (!this.f7508Ujhhgtgfeyxiexzf.contains(str3)) {
                            String str4 = (String) this.f7505Ujhhgtgfeyxiexzf.get(str3);
                            if (str4 != null) {
                                attributeName = str4;
                            }
                            C1982Ujhhgtgfeyxiexzf c1982Ujhhgtgfeyxiexzf3 = new C1982Ujhhgtgfeyxiexzf(str3, attributeName);
                            c1982Ujhhgtgfeyxiexzf3.m3330Ujhhgtgfeyxiexzf(attributeValue);
                            c1982Ujhhgtgfeyxiexzf2.f6547Ujhhgtgfeyxiexzf.add(c1982Ujhhgtgfeyxiexzf3);
                        }
                    }
                    m3493Ujhhgtgfeyxiexzf(c1982Ujhhgtgfeyxiexzf2, xmlPullParser);
                } else {
                    if (next != 4) {
                        if (next != 3 && next != 1) {
                            Log.i("XmlToJson", "unknown xml eventType " + next);
                        }
                        return;
                    }
                    c1982Ujhhgtgfeyxiexzf.m3330Ujhhgtgfeyxiexzf(xmlPullParser.getText());
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
