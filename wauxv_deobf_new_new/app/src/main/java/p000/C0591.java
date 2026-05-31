package p000;

import android.text.Editable;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᲀᤞᲁᲈᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0591 implements InterfaceC1433 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f2404;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f2405;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ C2571 f2406;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final /* synthetic */ C2045 f2407;

    public /* synthetic */ C0591(ArrayList arrayList, C2571 c2571, C2045 c2045, int i) {
        this.f2404 = i;
        this.f2405 = arrayList;
        this.f2406 = c2571;
        this.f2407 = c2045;
    }

    @Override // p000.InterfaceC1433
    public final Object invoke(Object obj) {
        final C1496 c1496 = (C1496) obj;
        switch (this.f2404) {
            case 0:
                if (c1496.m3421() == EnumC1497.f5303) {
                    C0615 c0615 = C0615.f2456;
                    final ArrayList arrayList = this.f2405;
                    final C0590 c0590 = new C0590(arrayList, this.f2406, this.f2407, 0);
                    c0615.getClass();
                    C1576.f5470.getClass();
                    final EditText editText = new EditText(C1576.m3456());
                    editText.setText(c1496.f5294);
                    String[] strArr = AbstractC1471.f5234;
                    editText.setHint("分组名称");
                    editText.setSelection(editText.getText().length());
                    C2037 c2037 = new C2037();
                    c2037.f6779 = "编辑分组";
                    c2037.f6781 = editText;
                    c2037.m4057("保存名称", new InterfaceC1422() { // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᲀᲁᤝᲈᤞ
                        @Override // p000.InterfaceC1422
                        public final Object invoke() {
                            String string;
                            String[] strArr2 = AbstractC1471.f5234;
                            Editable text = editText.getText();
                            String string2 = (text == null || (string = text.toString()) == null) ? null : AbstractC2901.m4882(string).toString();
                            if (string2 == null) {
                                string2 = "";
                            }
                            if (string2.length() == 0) {
                                AbstractC2894.m4856(null, 3, "分组名称不能为空");
                            } else {
                                ArrayList arrayList2 = arrayList;
                                Iterator it = arrayList2.iterator();
                                int i = 0;
                                while (true) {
                                    if (!it.hasNext()) {
                                        i = -1;
                                        break;
                                    }
                                    C1496 c1497 = (C1496) it.next();
                                    String str = c1497.f5292;
                                    C1496 c1498 = c1496;
                                    if (AbstractC1469.m3322(str, c1498.f5292) && c1497.f5293 == c1498.f5293 && AbstractC1469.m3322(c1497.f5294, c1498.f5294)) {
                                        break;
                                    }
                                    i++;
                                }
                                if (i < 0) {
                                    AbstractC2894.m4856(null, 3, "分组不存在");
                                } else {
                                    arrayList2.set(i, C1496.m3419((C1496) arrayList2.get(i), 0, string2, 27));
                                    C0615.f2456.getClass();
                                    if (C0615.m2138(arrayList2)) {
                                        c0590.invoke();
                                    }
                                }
                            }
                            return C3554.UNIT;
                        }
                    });
                    c2037.m4056("编辑成员", new C0596(arrayList, c1496, c0590, 0));
                    AbstractC2844.m4788(c2037, null, 3);
                }
                break;
            default:
                C0615 c0616 = C0615.f2456;
                C2045 c2045 = this.f2407;
                C2571 c2571 = this.f2406;
                ArrayList arrayList2 = this.f2405;
                C0590 c0591 = new C0590(c2045, c2571, arrayList2);
                c0616.getClass();
                C2037 c2038 = new C2037();
                String[] strArr2 = AbstractC1471.f5234;
                c2038.f6779 = "删除分组";
                c2038.f6780 = "确定删除“" + c1496.f5294 + "”吗？";
                c2038.m4057("删除", new C0596(arrayList2, c0591, c1496));
                AbstractC2844.m4788(c2038, null, 3);
                break;
        }
        return C3554.UNIT;
    }
}
