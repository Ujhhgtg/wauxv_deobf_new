package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.checkbox.MaterialCheckBox;
import java.io.IOException;
import java.util.ArrayList;
import me.hd.wauxv.R;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲈᤞᲀᲁᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1359 extends AbstractC2537 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final ArrayList f4868;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C1355 f4869;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C1526 f4870;

    public C1359(ArrayList arrayList, C1355 c1355, C1526 c1526) {
        this.f4868 = arrayList;
        this.f4869 = c1355;
        this.f4870 = c1526;
    }

    @Override // p000.AbstractC2537
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final int mo2124() {
        return this.f4868.size();
    }

    @Override // p000.AbstractC2537
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final void mo2125(AbstractC2563 abstractC2563, int i) {
        final C1358 c1358 = (C1358) abstractC2563;
        C1363 c1363 = (C1363) this.f4868.get(i);
        c1358.f4863.setText(c1363.f4874);
        c1358.f4864.setText(c1363.f4877 + " | " + c1363.f4878);
        MaterialCheckBox materialCheckBox = c1358.f4865;
        materialCheckBox.setOnCheckedChangeListener(null);
        materialCheckBox.setChecked(c1363.f4879);
        materialCheckBox.setOnCheckedChangeListener(new C0710(c1358, 2, this));
        final int i2 = 0;
        c1358.f4866.setOnClickListener(new View.OnClickListener() { // from class: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲈᤞᛸᲁᲀ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws IOException {
                switch (i2) {
                    case 0:
                        int iM4533 = c1358.m4533();
                        if (iM4533 != -1) {
                            C1359 c1359 = this;
                            c1359.f4869.invoke(c1359.f4868.get(iM4533));
                            break;
                        }
                        break;
                    default:
                        int iM4534 = c1358.m4533();
                        if (iM4534 != -1) {
                            C1359 c13510 = this;
                            c13510.f4870.invoke(c13510.f4868.get(iM4534));
                            break;
                        }
                        break;
                }
            }
        });
        final int i3 = 1;
        c1358.f4867.setOnClickListener(new View.OnClickListener() { // from class: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲈᤞᛸᲁᲀ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws IOException {
                switch (i3) {
                    case 0:
                        int iM4533 = c1358.m4533();
                        if (iM4533 != -1) {
                            C1359 c1359 = this;
                            c1359.f4869.invoke(c1359.f4868.get(iM4533));
                            break;
                        }
                        break;
                    default:
                        int iM4534 = c1358.m4533();
                        if (iM4534 != -1) {
                            C1359 c13510 = this;
                            c13510.f4870.invoke(c13510.f4868.get(iM4534));
                            break;
                        }
                        break;
                }
            }
        });
    }

    @Override // p000.AbstractC2537
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final AbstractC2563 mo2126(ViewGroup viewGroup, int i) {
        return new C1358(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_float_action_button_menu, viewGroup, false));
    }
}
