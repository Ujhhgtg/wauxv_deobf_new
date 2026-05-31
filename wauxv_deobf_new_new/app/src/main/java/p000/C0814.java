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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᛸᲀᲇᲈᤞᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0814 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public C0815 f3188;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C2933 f3192;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C2933 f3193;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final C2933 f3194;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final C2933 f3195;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final C2933 f3196;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final C2933 f3197;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final C2933 f3198;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C2933 f3189 = new C2933(new C0112(22));

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C2933 f3190 = new C2933(new C0112(23));

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C2933 f3191 = new C2933(new C0112(24));

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public C0799 f3199 = new C0799(this);

    public C0814() {
        final int i = 0;
        this.f3192 = new C2933(new InterfaceC1422(this) { // from class: ᛱᛲᛳᛴᛵᛶᛷᤝᛸᲀᲇᲁᲈᤞ

            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
            public final /* synthetic */ C0814 f3187;

            {
                this.f3187 = this;
            }

            @Override // p000.InterfaceC1422
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (RecyclerView) ((LinearLayout) this.f3187.f3191.getValue()).findViewById(R.id.itemContactRecyclerView);
                    case 1:
                        return (EditText) this.f3187.m2479().findViewById(R.id.etSearch);
                    case 2:
                        return (Button) this.f3187.m2479().findViewById(R.id.btnCancel);
                    case 3:
                        return (Button) this.f3187.m2479().findViewById(R.id.btnConfirm);
                    case 4:
                        return (RadioGroup) this.f3187.m2479().findViewById(R.id.rgTabs);
                    case 5:
                        return (CheckBox) this.f3187.m2479().findViewById(R.id.cbSelectAll);
                    default:
                        return (TextView) this.f3187.m2479().findViewById(R.id.tvCounter);
                }
            }
        });
        final int i2 = 1;
        this.f3193 = new C2933(new InterfaceC1422(this) { // from class: ᛱᛲᛳᛴᛵᛶᛷᤝᛸᲀᲇᲁᲈᤞ

            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
            public final /* synthetic */ C0814 f3187;

            {
                this.f3187 = this;
            }

            @Override // p000.InterfaceC1422
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (RecyclerView) ((LinearLayout) this.f3187.f3191.getValue()).findViewById(R.id.itemContactRecyclerView);
                    case 1:
                        return (EditText) this.f3187.m2479().findViewById(R.id.etSearch);
                    case 2:
                        return (Button) this.f3187.m2479().findViewById(R.id.btnCancel);
                    case 3:
                        return (Button) this.f3187.m2479().findViewById(R.id.btnConfirm);
                    case 4:
                        return (RadioGroup) this.f3187.m2479().findViewById(R.id.rgTabs);
                    case 5:
                        return (CheckBox) this.f3187.m2479().findViewById(R.id.cbSelectAll);
                    default:
                        return (TextView) this.f3187.m2479().findViewById(R.id.tvCounter);
                }
            }
        });
        final int i3 = 2;
        this.f3194 = new C2933(new InterfaceC1422(this) { // from class: ᛱᛲᛳᛴᛵᛶᛷᤝᛸᲀᲇᲁᲈᤞ

            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
            public final /* synthetic */ C0814 f3187;

            {
                this.f3187 = this;
            }

            @Override // p000.InterfaceC1422
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return (RecyclerView) ((LinearLayout) this.f3187.f3191.getValue()).findViewById(R.id.itemContactRecyclerView);
                    case 1:
                        return (EditText) this.f3187.m2479().findViewById(R.id.etSearch);
                    case 2:
                        return (Button) this.f3187.m2479().findViewById(R.id.btnCancel);
                    case 3:
                        return (Button) this.f3187.m2479().findViewById(R.id.btnConfirm);
                    case 4:
                        return (RadioGroup) this.f3187.m2479().findViewById(R.id.rgTabs);
                    case 5:
                        return (CheckBox) this.f3187.m2479().findViewById(R.id.cbSelectAll);
                    default:
                        return (TextView) this.f3187.m2479().findViewById(R.id.tvCounter);
                }
            }
        });
        final int i4 = 3;
        this.f3195 = new C2933(new InterfaceC1422(this) { // from class: ᛱᛲᛳᛴᛵᛶᛷᤝᛸᲀᲇᲁᲈᤞ

            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
            public final /* synthetic */ C0814 f3187;

            {
                this.f3187 = this;
            }

            @Override // p000.InterfaceC1422
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        return (RecyclerView) ((LinearLayout) this.f3187.f3191.getValue()).findViewById(R.id.itemContactRecyclerView);
                    case 1:
                        return (EditText) this.f3187.m2479().findViewById(R.id.etSearch);
                    case 2:
                        return (Button) this.f3187.m2479().findViewById(R.id.btnCancel);
                    case 3:
                        return (Button) this.f3187.m2479().findViewById(R.id.btnConfirm);
                    case 4:
                        return (RadioGroup) this.f3187.m2479().findViewById(R.id.rgTabs);
                    case 5:
                        return (CheckBox) this.f3187.m2479().findViewById(R.id.cbSelectAll);
                    default:
                        return (TextView) this.f3187.m2479().findViewById(R.id.tvCounter);
                }
            }
        });
        final int i5 = 4;
        this.f3196 = new C2933(new InterfaceC1422(this) { // from class: ᛱᛲᛳᛴᛵᛶᛷᤝᛸᲀᲇᲁᲈᤞ

            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
            public final /* synthetic */ C0814 f3187;

            {
                this.f3187 = this;
            }

            @Override // p000.InterfaceC1422
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        return (RecyclerView) ((LinearLayout) this.f3187.f3191.getValue()).findViewById(R.id.itemContactRecyclerView);
                    case 1:
                        return (EditText) this.f3187.m2479().findViewById(R.id.etSearch);
                    case 2:
                        return (Button) this.f3187.m2479().findViewById(R.id.btnCancel);
                    case 3:
                        return (Button) this.f3187.m2479().findViewById(R.id.btnConfirm);
                    case 4:
                        return (RadioGroup) this.f3187.m2479().findViewById(R.id.rgTabs);
                    case 5:
                        return (CheckBox) this.f3187.m2479().findViewById(R.id.cbSelectAll);
                    default:
                        return (TextView) this.f3187.m2479().findViewById(R.id.tvCounter);
                }
            }
        });
        final int i6 = 5;
        this.f3197 = new C2933(new InterfaceC1422(this) { // from class: ᛱᛲᛳᛴᛵᛶᛷᤝᛸᲀᲇᲁᲈᤞ

            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
            public final /* synthetic */ C0814 f3187;

            {
                this.f3187 = this;
            }

            @Override // p000.InterfaceC1422
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        return (RecyclerView) ((LinearLayout) this.f3187.f3191.getValue()).findViewById(R.id.itemContactRecyclerView);
                    case 1:
                        return (EditText) this.f3187.m2479().findViewById(R.id.etSearch);
                    case 2:
                        return (Button) this.f3187.m2479().findViewById(R.id.btnCancel);
                    case 3:
                        return (Button) this.f3187.m2479().findViewById(R.id.btnConfirm);
                    case 4:
                        return (RadioGroup) this.f3187.m2479().findViewById(R.id.rgTabs);
                    case 5:
                        return (CheckBox) this.f3187.m2479().findViewById(R.id.cbSelectAll);
                    default:
                        return (TextView) this.f3187.m2479().findViewById(R.id.tvCounter);
                }
            }
        });
        final int i7 = 6;
        this.f3198 = new C2933(new InterfaceC1422(this) { // from class: ᛱᛲᛳᛴᛵᛶᛷᤝᛸᲀᲇᲁᲈᤞ

            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
            public final /* synthetic */ C0814 f3187;

            {
                this.f3187 = this;
            }

            @Override // p000.InterfaceC1422
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return (RecyclerView) ((LinearLayout) this.f3187.f3191.getValue()).findViewById(R.id.itemContactRecyclerView);
                    case 1:
                        return (EditText) this.f3187.m2479().findViewById(R.id.etSearch);
                    case 2:
                        return (Button) this.f3187.m2479().findViewById(R.id.btnCancel);
                    case 3:
                        return (Button) this.f3187.m2479().findViewById(R.id.btnConfirm);
                    case 4:
                        return (RadioGroup) this.f3187.m2479().findViewById(R.id.rgTabs);
                    case 5:
                        return (CheckBox) this.f3187.m2479().findViewById(R.id.cbSelectAll);
                    default:
                        return (TextView) this.f3187.m2479().findViewById(R.id.tvCounter);
                }
            }
        });
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final LinearLayout m2479() {
        return (LinearLayout) this.f3190.getValue();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m2480() {
        List list = this.f3199.f3165;
        boolean z = true;
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!((C0800) it.next()).f3170) {
                    z = false;
                    break;
                }
            }
        }
        ((CheckBox) this.f3197.getValue()).setChecked(z);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m2481(String str) {
        C0815 c0815 = this.f3188;
        C2348 c2348 = null;
        if (c0815 == null) {
            "info";
            c0815 = null;
        }
        RadioGroup radioGroup = (RadioGroup) c0815.f3200.f3196.getValue();
        int childCount = radioGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = radioGroup.getChildAt(i);
            if (childAt instanceof RadioButton) {
                RadioButton radioButton = (RadioButton) childAt;
                CharSequence text = radioButton.getText();
                if (radioButton.isChecked()) {
                    c2348 = new C2348(text.toString(), c0815.m2485(text.toString()));
                    break;
                }
            }
        }
        List list = (List) c2348.f7568;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            C0800 c0800 = (C0800) obj;
            String str2 = c0800.f3168;
            String str3 = c0800.f3169;
            if (AbstractC2901.m4861(str2, str, true) || AbstractC2901.m4861(str3, str, true)) {
                arrayList.add(obj);
            }
        }
        this.f3199 = new C0799(this);
        ((RecyclerView) this.f3192.getValue()).setAdapter(this.f3199);
        C0799.m2467(this.f3199, arrayList);
        m2480();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m2482() {
        TextView textView = (TextView) this.f3198.getValue();
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("已选择 ");
        C0815 c0815 = this.f3188;
        if (c0815 == null) {
            "info";
            c0815 = null;
        }
        sb.append(c0815.m2484().size());
        sb.append(" 项");
        textView.setText(sb.toString());
    }
}
