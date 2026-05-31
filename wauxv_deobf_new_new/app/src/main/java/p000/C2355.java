package p000;

import android.view.View;
import android.widget.TextView;
import com.google.android.material.checkbox.MaterialCheckBox;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᛸᲈᲁᲇᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2355 extends AbstractC2563 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public final TextView f7577;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public final TextView f7578;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public final MaterialCheckBox f7579;

    public C2355(View view) {
        super(view);
        this.f7577 = (TextView) view.findViewById(R.id.itemPanelEmojiTvTitle);
        this.f7578 = (TextView) view.findViewById(R.id.itemPanelEmojiTvDesc);
        this.f7579 = (MaterialCheckBox) view.findViewById(R.id.itemPanelEmojiCbEnable);
    }
}
