package p000;

import android.util.Log;
import android.widget.LinearLayout;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.textfield.TextInputEditText;
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

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2014 {

    public final /* synthetic */ int f6713 = 1;

    public Object f6714;

    public Object f6715;

    public Object f6716;

    public Object f6717;

    public Object f6718;

    public Object f6719;

    public Object f6720;

    public Object f6721;

    public /* synthetic */ C2014() {
    }

    public String toString() {
        switch (1) {
            case 1:
                JSONObject jSONObject = (JSONObject) this.f6721;
                if (jSONObject != null) {
                    return jSONObject.toString();
                }
                return null;
            default:
                return super.toString();
        }
    }

    public JSONObject m3873(C2892 c2892) {
        JSONObject jSONObject = new JSONObject();
        if (c2892.f9309 != null) {
            String str = c2892.f9306;
            String str2 = (String) ((HashMap) this.f6717).get(str);
            if (str2 == null) {
                str2 = "content";
            }
            m3874(str, jSONObject, str2, c2892.f9309);
        }
        try {
            HashMap map = new HashMap();
            for (C2892 c2893 : c2892.f9308) {
                String str3 = c2893.f9307;
                ArrayList arrayList = (ArrayList) map.get(str3);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map.put(str3, arrayList);
                }
                arrayList.add(c2893);
            }
            for (ArrayList arrayList2 : map.values()) {
                if (arrayList2.size() == 1) {
                    C2892 c2894 = (C2892) arrayList2.get(0);
                    String str4 = c2894.f9306;
                    String str5 = c2894.f9307;
                    if (!((HashSet) this.f6714).contains(str4)) {
                        Iterator it = ((HashSet) this.f6715).iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                if (c2894.f9308.size() <= 0) {
                                    m3874(c2894.f9306, jSONObject, str5, c2894.f9309);
                                    break;
                                }
                                jSONObject.put(str5, m3873(c2894));
                                break;
                            }
                            if (((Pattern) it.next()).matcher(str4).find()) {
                            }
                        }
                    }
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(m3873(c2894));
                    jSONObject.put(str5, jSONArray);
                    break;
                }
                JSONArray jSONArray2 = new JSONArray();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    jSONArray2.put(m3873((C2892) it2.next()));
                }
                jSONObject.put(((C2892) arrayList2.get(0)).f9307, jSONArray2);
            }
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void m3874(String str, JSONObject jSONObject, String str2, String str3) {
        try {
            Class cls = (Class) ((HashMap) this.f6718).get(str);
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

    public void m3875(C2892 c2892, XmlPullParser xmlPullParser) {
        int next;
        String str = c2892.f9306;
        do {
            try {
                next = xmlPullParser.next();
                if (next == 2) {
                    String name = xmlPullParser.getName();
                    String str2 = str + "/" + name;
                    boolean zContains = ((HashSet) this.f6720).contains(str2);
                    C2892 c2893 = new C2892(str2, name);
                    if (!zContains) {
                        c2892.f9308.add(c2893);
                    }
                    int attributeCount = xmlPullParser.getAttributeCount();
                    for (int i = 0; i < attributeCount; i++) {
                        String attributeName = xmlPullParser.getAttributeName(i);
                        String attributeValue = xmlPullParser.getAttributeValue(i);
                        String str3 = str + "/" + c2893.f9307 + "/" + attributeName;
                        if (!((HashSet) this.f6719).contains(str3)) {
                            String str4 = (String) ((HashMap) this.f6716).get(str3);
                            if (str4 != null) {
                                attributeName = str4;
                            }
                            C2892 c2894 = new C2892(str3, attributeName);
                            c2894.m4899(attributeValue);
                            c2893.f9308.add(c2894);
                        }
                    }
                    m3875(c2893, xmlPullParser);
                } else {
                    if (next != 4) {
                        if (next != 3 && next != 1) {
                            Log.i("XmlToJson", "unknown xml eventType " + next);
                        }
                        return;
                    }
                    c2892.m4899(xmlPullParser.getText());
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
        } while (true);
    }

    public C2014(LinearLayout linearLayout, MaterialCheckBox materialCheckBox, MaterialCheckBox materialCheckBox2, MaterialCheckBox materialCheckBox3, MaterialCheckBox materialCheckBox4, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, TextInputEditText textInputEditText3, TextInputEditText textInputEditText4) {
        this.f6714 = materialCheckBox;
        this.f6715 = materialCheckBox2;
        this.f6716 = materialCheckBox3;
        this.f6717 = materialCheckBox4;
        this.f6718 = textInputEditText;
        this.f6719 = textInputEditText2;
        this.f6720 = textInputEditText3;
        this.f6721 = textInputEditText4;
    }
}
