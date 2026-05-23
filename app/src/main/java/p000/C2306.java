package p000;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᲈᤝᲁᲇᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2306 extends AbstractC1138 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f7426;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2306(AbstractC2491 abstractC2491, int i) {
        super(abstractC2491);
        this.f7426 = i;
    }

    @Override // p000.AbstractC1138
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final int mo2737(View view) {
        int iM4458;
        int i;
        switch (this.f7426) {
            case 0:
                C2492 c2492 = (C2492) view.getLayoutParams();
                ((AbstractC2491) this.f4233).getClass();
                iM4458 = AbstractC2491.m4458(view);
                i = ((ViewGroup.MarginLayoutParams) c2492).rightMargin;
                break;
            default:
                C2492 c2493 = (C2492) view.getLayoutParams();
                ((AbstractC2491) this.f4233).getClass();
                iM4458 = AbstractC2491.m4454(view);
                i = ((ViewGroup.MarginLayoutParams) c2493).bottomMargin;
                break;
        }
        return iM4458 + i;
    }

    @Override // p000.AbstractC1138
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final int mo2738(View view) {
        int iM4457;
        int i;
        switch (this.f7426) {
            case 0:
                C2492 c2492 = (C2492) view.getLayoutParams();
                ((AbstractC2491) this.f4233).getClass();
                iM4457 = AbstractC2491.m4457(view) + ((ViewGroup.MarginLayoutParams) c2492).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) c2492).rightMargin;
                break;
            default:
                C2492 c2493 = (C2492) view.getLayoutParams();
                ((AbstractC2491) this.f4233).getClass();
                iM4457 = AbstractC2491.m4456(view) + ((ViewGroup.MarginLayoutParams) c2493).topMargin;
                i = ((ViewGroup.MarginLayoutParams) c2493).bottomMargin;
                break;
        }
        return iM4457 + i;
    }

    @Override // p000.AbstractC1138
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final int mo2739(View view) {
        int iM4456;
        int i;
        switch (this.f7426) {
            case 0:
                C2492 c2492 = (C2492) view.getLayoutParams();
                ((AbstractC2491) this.f4233).getClass();
                iM4456 = AbstractC2491.m4456(view) + ((ViewGroup.MarginLayoutParams) c2492).topMargin;
                i = ((ViewGroup.MarginLayoutParams) c2492).bottomMargin;
                break;
            default:
                C2492 c2493 = (C2492) view.getLayoutParams();
                ((AbstractC2491) this.f4233).getClass();
                iM4456 = AbstractC2491.m4457(view) + ((ViewGroup.MarginLayoutParams) c2493).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) c2493).rightMargin;
                break;
        }
        return iM4456 + i;
    }

    @Override // p000.AbstractC1138
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final int mo2740(View view) {
        int iM4455;
        int i;
        switch (this.f7426) {
            case 0:
                C2492 c2492 = (C2492) view.getLayoutParams();
                ((AbstractC2491) this.f4233).getClass();
                iM4455 = AbstractC2491.m4455(view);
                i = ((ViewGroup.MarginLayoutParams) c2492).leftMargin;
                break;
            default:
                C2492 c2493 = (C2492) view.getLayoutParams();
                ((AbstractC2491) this.f4233).getClass();
                iM4455 = AbstractC2491.m4459(view);
                i = ((ViewGroup.MarginLayoutParams) c2493).topMargin;
                break;
        }
        return iM4455 - i;
    }

    @Override // p000.AbstractC1138
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final int mo2741() {
        switch (this.f7426) {
            case 0:
                return ((AbstractC2491) this.f4233).f7954;
            default:
                return ((AbstractC2491) this.f4233).f7955;
        }
    }

    @Override // p000.AbstractC1138
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final int mo2742() {
        int i;
        int iM4471;
        switch (this.f7426) {
            case 0:
                AbstractC2491 abstractC2491 = (AbstractC2491) this.f4233;
                i = abstractC2491.f7954;
                iM4471 = abstractC2491.m4471();
                break;
            default:
                AbstractC2491 abstractC2492 = (AbstractC2491) this.f4233;
                i = abstractC2492.f7955;
                iM4471 = abstractC2492.m4469();
                break;
        }
        return i - iM4471;
    }

    @Override // p000.AbstractC1138
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final int mo2743() {
        switch (this.f7426) {
            case 0:
                return ((AbstractC2491) this.f4233).m4471();
            default:
                return ((AbstractC2491) this.f4233).m4469();
        }
    }

    @Override // p000.AbstractC1138
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final int mo2744() {
        switch (this.f7426) {
            case 0:
                return ((AbstractC2491) this.f4233).f7952;
            default:
                return ((AbstractC2491) this.f4233).f7953;
        }
    }

    @Override // p000.AbstractC1138
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public final int mo2745() {
        switch (this.f7426) {
            case 0:
                return ((AbstractC2491) this.f4233).f7953;
            default:
                return ((AbstractC2491) this.f4233).f7952;
        }
    }

    @Override // p000.AbstractC1138
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final int mo2746() {
        switch (this.f7426) {
            case 0:
                return ((AbstractC2491) this.f4233).m4470();
            default:
                return ((AbstractC2491) this.f4233).m4472();
        }
    }

    @Override // p000.AbstractC1138
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ */
    public final int mo2747() {
        int iM4470;
        int iM4471;
        switch (this.f7426) {
            case 0:
                AbstractC2491 abstractC2491 = (AbstractC2491) this.f4233;
                iM4470 = abstractC2491.f7954 - abstractC2491.m4470();
                iM4471 = abstractC2491.m4471();
                break;
            default:
                AbstractC2491 abstractC2492 = (AbstractC2491) this.f4233;
                iM4470 = abstractC2492.f7955 - abstractC2492.m4472();
                iM4471 = abstractC2492.m4469();
                break;
        }
        return iM4470 - iM4471;
    }

    @Override // p000.AbstractC1138
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ */
    public final int mo2748(View view) {
        switch (this.f7426) {
            case 0:
                AbstractC2491 abstractC2491 = (AbstractC2491) this.f4233;
                Rect rect = (Rect) this.f4234;
                abstractC2491.m4473(rect, view);
                return rect.right;
            default:
                AbstractC2491 abstractC2492 = (AbstractC2491) this.f4233;
                Rect rect2 = (Rect) this.f4234;
                abstractC2492.m4473(rect2, view);
                return rect2.bottom;
        }
    }

    @Override // p000.AbstractC1138
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ */
    public final int mo2749(View view) {
        switch (this.f7426) {
            case 0:
                AbstractC2491 abstractC2491 = (AbstractC2491) this.f4233;
                Rect rect = (Rect) this.f4234;
                abstractC2491.m4473(rect, view);
                return rect.left;
            default:
                AbstractC2491 abstractC2492 = (AbstractC2491) this.f4233;
                Rect rect2 = (Rect) this.f4234;
                abstractC2492.m4473(rect2, view);
                return rect2.top;
        }
    }

    @Override // p000.AbstractC1138
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ */
    public final void mo2750(int i) {
        switch (this.f7426) {
            case 0:
                ((AbstractC2491) this.f4233).mo263(i);
                break;
            default:
                ((AbstractC2491) this.f4233).mo264(i);
                break;
        }
    }
}
