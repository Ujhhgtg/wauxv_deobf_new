package p000;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.hd.wauxv.R;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᛸᲁᤞᲀᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0815 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public C0816 f3181;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C2873 f3185;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C2873 f3186;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final C2873 f3187;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final C2873 f3188;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final C2873 f3189;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final C2873 f3190;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final C2873 f3191;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C2873 f3182 = new C2873(new C0104(22));

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C2873 f3183 = new C2873(new C0104(23));

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C2873 f3184 = new C2873(new C0104(24));

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public C0800 f3192 = new C0800(this);

    public C0815() {
        final int i = 0;
        this.f3185 = new C2873(new InterfaceC1414(this) { // from class: ᛱᛲᛳᛴᛵᛶᛷᤝᛸᲀᲈᲇᲁᤞ

            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
            public final /* synthetic */ C0815 f3180;

            {
                this.f3180 = this;
            }

            @Override // p000.InterfaceC1414
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (RecyclerView) ((LinearLayout) this.f3180.f3184.getValue()).findViewById(R.id.itemContactRecyclerView);
                    case 1:
                        return (EditText) this.f3180.m2363().findViewById(R.id.etSearch);
                    case 2:
                        return (Button) this.f3180.m2363().findViewById(R.id.btnCancel);
                    case 3:
                        return (Button) this.f3180.m2363().findViewById(R.id.btnConfirm);
                    case 4:
                        return (RadioGroup) this.f3180.m2363().findViewById(R.id.rgTabs);
                    case 5:
                        return (CheckBox) this.f3180.m2363().findViewById(R.id.cbSelectAll);
                    default:
                        return (TextView) this.f3180.m2363().findViewById(R.id.tvCounter);
                }
            }
        });
        final int i2 = 1;
        this.f3186 = new C2873(new InterfaceC1414(this) { // from class: ᛱᛲᛳᛴᛵᛶᛷᤝᛸᲀᲈᲇᲁᤞ

            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
            public final /* synthetic */ C0815 f3180;

            {
                this.f3180 = this;
            }

            @Override // p000.InterfaceC1414
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (RecyclerView) ((LinearLayout) this.f3180.f3184.getValue()).findViewById(R.id.itemContactRecyclerView);
                    case 1:
                        return (EditText) this.f3180.m2363().findViewById(R.id.etSearch);
                    case 2:
                        return (Button) this.f3180.m2363().findViewById(R.id.btnCancel);
                    case 3:
                        return (Button) this.f3180.m2363().findViewById(R.id.btnConfirm);
                    case 4:
                        return (RadioGroup) this.f3180.m2363().findViewById(R.id.rgTabs);
                    case 5:
                        return (CheckBox) this.f3180.m2363().findViewById(R.id.cbSelectAll);
                    default:
                        return (TextView) this.f3180.m2363().findViewById(R.id.tvCounter);
                }
            }
        });
        final int i3 = 2;
        this.f3187 = new C2873(new InterfaceC1414(this) { // from class: ᛱᛲᛳᛴᛵᛶᛷᤝᛸᲀᲈᲇᲁᤞ

            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
            public final /* synthetic */ C0815 f3180;

            {
                this.f3180 = this;
            }

            @Override // p000.InterfaceC1414
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return (RecyclerView) ((LinearLayout) this.f3180.f3184.getValue()).findViewById(R.id.itemContactRecyclerView);
                    case 1:
                        return (EditText) this.f3180.m2363().findViewById(R.id.etSearch);
                    case 2:
                        return (Button) this.f3180.m2363().findViewById(R.id.btnCancel);
                    case 3:
                        return (Button) this.f3180.m2363().findViewById(R.id.btnConfirm);
                    case 4:
                        return (RadioGroup) this.f3180.m2363().findViewById(R.id.rgTabs);
                    case 5:
                        return (CheckBox) this.f3180.m2363().findViewById(R.id.cbSelectAll);
                    default:
                        return (TextView) this.f3180.m2363().findViewById(R.id.tvCounter);
                }
            }
        });
        final int i4 = 3;
        this.f3188 = new C2873(new InterfaceC1414(this) { // from class: ᛱᛲᛳᛴᛵᛶᛷᤝᛸᲀᲈᲇᲁᤞ

            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
            public final /* synthetic */ C0815 f3180;

            {
                this.f3180 = this;
            }

            @Override // p000.InterfaceC1414
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        return (RecyclerView) ((LinearLayout) this.f3180.f3184.getValue()).findViewById(R.id.itemContactRecyclerView);
                    case 1:
                        return (EditText) this.f3180.m2363().findViewById(R.id.etSearch);
                    case 2:
                        return (Button) this.f3180.m2363().findViewById(R.id.btnCancel);
                    case 3:
                        return (Button) this.f3180.m2363().findViewById(R.id.btnConfirm);
                    case 4:
                        return (RadioGroup) this.f3180.m2363().findViewById(R.id.rgTabs);
                    case 5:
                        return (CheckBox) this.f3180.m2363().findViewById(R.id.cbSelectAll);
                    default:
                        return (TextView) this.f3180.m2363().findViewById(R.id.tvCounter);
                }
            }
        });
        final int i5 = 4;
        this.f3189 = new C2873(new InterfaceC1414(this) { // from class: ᛱᛲᛳᛴᛵᛶᛷᤝᛸᲀᲈᲇᲁᤞ

            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
            public final /* synthetic */ C0815 f3180;

            {
                this.f3180 = this;
            }

            @Override // p000.InterfaceC1414
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        return (RecyclerView) ((LinearLayout) this.f3180.f3184.getValue()).findViewById(R.id.itemContactRecyclerView);
                    case 1:
                        return (EditText) this.f3180.m2363().findViewById(R.id.etSearch);
                    case 2:
                        return (Button) this.f3180.m2363().findViewById(R.id.btnCancel);
                    case 3:
                        return (Button) this.f3180.m2363().findViewById(R.id.btnConfirm);
                    case 4:
                        return (RadioGroup) this.f3180.m2363().findViewById(R.id.rgTabs);
                    case 5:
                        return (CheckBox) this.f3180.m2363().findViewById(R.id.cbSelectAll);
                    default:
                        return (TextView) this.f3180.m2363().findViewById(R.id.tvCounter);
                }
            }
        });
        final int i6 = 5;
        this.f3190 = new C2873(new InterfaceC1414(this) { // from class: ᛱᛲᛳᛴᛵᛶᛷᤝᛸᲀᲈᲇᲁᤞ

            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
            public final /* synthetic */ C0815 f3180;

            {
                this.f3180 = this;
            }

            @Override // p000.InterfaceC1414
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        return (RecyclerView) ((LinearLayout) this.f3180.f3184.getValue()).findViewById(R.id.itemContactRecyclerView);
                    case 1:
                        return (EditText) this.f3180.m2363().findViewById(R.id.etSearch);
                    case 2:
                        return (Button) this.f3180.m2363().findViewById(R.id.btnCancel);
                    case 3:
                        return (Button) this.f3180.m2363().findViewById(R.id.btnConfirm);
                    case 4:
                        return (RadioGroup) this.f3180.m2363().findViewById(R.id.rgTabs);
                    case 5:
                        return (CheckBox) this.f3180.m2363().findViewById(R.id.cbSelectAll);
                    default:
                        return (TextView) this.f3180.m2363().findViewById(R.id.tvCounter);
                }
            }
        });
        final int i7 = 6;
        this.f3191 = new C2873(new InterfaceC1414(this) { // from class: ᛱᛲᛳᛴᛵᛶᛷᤝᛸᲀᲈᲇᲁᤞ

            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
            public final /* synthetic */ C0815 f3180;

            {
                this.f3180 = this;
            }

            @Override // p000.InterfaceC1414
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return (RecyclerView) ((LinearLayout) this.f3180.f3184.getValue()).findViewById(R.id.itemContactRecyclerView);
                    case 1:
                        return (EditText) this.f3180.m2363().findViewById(R.id.etSearch);
                    case 2:
                        return (Button) this.f3180.m2363().findViewById(R.id.btnCancel);
                    case 3:
                        return (Button) this.f3180.m2363().findViewById(R.id.btnConfirm);
                    case 4:
                        return (RadioGroup) this.f3180.m2363().findViewById(R.id.rgTabs);
                    case 5:
                        return (CheckBox) this.f3180.m2363().findViewById(R.id.cbSelectAll);
                    default:
                        return (TextView) this.f3180.m2363().findViewById(R.id.tvCounter);
                }
            }
        });
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C1962 m2362() {
        return (C1962) this.f3182.getValue();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final LinearLayout m2363() {
        return (LinearLayout) this.f3183.getValue();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m2364() {
        List list = this.f3192.f3158;
        boolean z = true;
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!((C0801) it.next()).f3163) {
                    z = false;
                    break;
                }
            }
        }
        ((CheckBox) this.f3190.getValue()).setChecked(z);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m2365(String str) {
        C0816 c0816 = this.f3181;
        C2315 c2315 = null;
        if (c0816 == null) {
            "info";
            c0816 = null;
        }
        RadioGroup radioGroup = (RadioGroup) c0816.f3193.f3189.getValue();
        int childCount = radioGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = radioGroup.getChildAt(i);
            if (childAt instanceof RadioButton) {
                RadioButton radioButton = (RadioButton) childAt;
                CharSequence text = radioButton.getText();
                if (radioButton.isChecked()) {
                    c2315 = new C2315(text.toString(), c0816.m2369(text.toString()));
                    break;
                }
            }
        }
        List list = (List) c2315.f7446;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            C0801 c0801 = (C0801) obj;
            String str2 = c0801.f3161;
            String str3 = c0801.f3162;
            if (AbstractC2841.m4828(str2, str, true) || AbstractC2841.m4828(str3, str, true)) {
                arrayList.add(obj);
            }
        }
        this.f3192 = new C0800(this);
        ((RecyclerView) this.f3185.getValue()).setAdapter(this.f3192);
        C0800.m2351(this.f3192, arrayList);
        m2364();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void m2366() {
        TextView textView = (TextView) this.f3191.getValue();
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("已选择 ");
        C0816 c0816 = this.f3181;
        if (c0816 == null) {
            "info";
            c0816 = null;
        }
        sb.append(c0816.m2368().size());
        sb.append(" 项");
        textView.setText(sb.toString());
    }
}
