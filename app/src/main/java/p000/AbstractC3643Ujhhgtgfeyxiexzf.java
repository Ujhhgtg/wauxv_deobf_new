package p000;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸能不能ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3643Ujhhgtgfeyxiexzf extends View {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public int[] f11388Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public int f11389Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public Context f11390Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public AbstractC0548Ujhhgtgfeyxiexzf f11391Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public String f11392Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public String f11393Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public HashMap f11394Ujhhgtgfeyxiexzf;

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f11388Ujhhgtgfeyxiexzf, this.f11389Ujhhgtgfeyxiexzf);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f11392Ujhhgtgfeyxiexzf;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f11393Ujhhgtgfeyxiexzf;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f11392Ujhhgtgfeyxiexzf = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f11389Ujhhgtgfeyxiexzf = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                m5299Ujhhgtgfeyxiexzf(str.substring(i));
                return;
            } else {
                m5299Ujhhgtgfeyxiexzf(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f11393Ujhhgtgfeyxiexzf = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f11389Ujhhgtgfeyxiexzf = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                m5301Ujhhgtgfeyxiexzf(str.substring(i));
                return;
            } else {
                m5301Ujhhgtgfeyxiexzf(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f11392Ujhhgtgfeyxiexzf = null;
        this.f11389Ujhhgtgfeyxiexzf = 0;
        for (int i : iArr) {
            m5300Ujhhgtgfeyxiexzf(i);
        }
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.f11392Ujhhgtgfeyxiexzf == null) {
            m5300Ujhhgtgfeyxiexzf(i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x005a  */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m5299Ujhhgtgfeyxiexzf(String str) {
        int identifier;
        HashMap map;
        Context context = this.f11390Ujhhgtgfeyxiexzf;
        if (str == null || str.length() == 0 || context == null) {
            return;
        }
        String strTrim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (!isInEditMode() || constraintLayout == null) {
            identifier = 0;
        } else {
            Object obj = (strTrim == null || (map = constraintLayout.f210Ujhhgtgfeyxiexzf) == null || !map.containsKey(strTrim)) ? null : constraintLayout.f210Ujhhgtgfeyxiexzf.get(strTrim);
            if (obj instanceof Integer) {
                identifier = ((Integer) obj).intValue();
            } else {
                identifier = 0;
            }
        }
        if (identifier == 0 && constraintLayout != null) {
            identifier = m5303Ujhhgtgfeyxiexzf(constraintLayout, strTrim);
        }
        if (identifier == 0) {
            try {
                identifier = AbstractC0763feyxiexzfUjhhgtg.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (identifier == 0) {
            identifier = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
        }
        if (identifier != 0) {
            this.f11394Ujhhgtgfeyxiexzf.put(Integer.valueOf(identifier), strTrim);
            m5300Ujhhgtgfeyxiexzf(identifier);
        } else {
            Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void m5300Ujhhgtgfeyxiexzf(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.f11389Ujhhgtgfeyxiexzf + 1;
        int[] iArr = this.f11388Ujhhgtgfeyxiexzf;
        if (i2 > iArr.length) {
            this.f11388Ujhhgtgfeyxiexzf = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f11388Ujhhgtgfeyxiexzf;
        int i3 = this.f11389Ujhhgtgfeyxiexzf;
        iArr2[i3] = i;
        this.f11389Ujhhgtgfeyxiexzf = i3 + 1;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final void m5301Ujhhgtgfeyxiexzf(String str) {
        if (str == null || str.length() == 0 || this.f11390Ujhhgtgfeyxiexzf == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof C3645Ujhhgtgfeyxiexzf) && strTrim.equals(((C3645Ujhhgtgfeyxiexzf) layoutParams).f11442feyxiexzfUjhhgtg)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    m5300Ujhhgtgfeyxiexzf(childAt.getId());
                }
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final void m5302Ujhhgtgfeyxiexzf() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) parent;
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.f11389Ujhhgtgfeyxiexzf; i++) {
            View view = (View) constraintLayout.f198Ujhhgtgfeyxiexzf.get(this.f11388Ujhhgtgfeyxiexzf[i]);
            if (view != null) {
                view.setVisibility(visibility);
                if (elevation > 0.0f) {
                    view.setTranslationZ(view.getTranslationZ() + elevation);
                }
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final int m5303Ujhhgtgfeyxiexzf(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str != null && (resources = this.f11390Ujhhgtgfeyxiexzf.getResources()) != null) {
            int childCount = constraintLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = constraintLayout.getChildAt(i);
                if (childAt.getId() != -1) {
                    try {
                        resourceEntryName = resources.getResourceEntryName(childAt.getId());
                    } catch (Resources.NotFoundException unused) {
                        resourceEntryName = null;
                    }
                    if (str.equals(resourceEntryName)) {
                        return childAt.getId();
                    }
                }
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public void mo3525Ujhhgtgfeyxiexzf(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC0773feyxiexzfUjhhgtg.f3057Ujhhgtgfeyxiexzf);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 19) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f11392Ujhhgtgfeyxiexzf = string;
                    setIds(string);
                } else if (index == 20) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f11393Ujhhgtgfeyxiexzf = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ */
    public abstract void mo51Ujhhgtgfeyxiexzf(C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf, boolean z);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final void m5304Ujhhgtgfeyxiexzf() {
        if (this.f11391Ujhhgtgfeyxiexzf == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof C3645Ujhhgtgfeyxiexzf) {
            ((C3645Ujhhgtgfeyxiexzf) layoutParams).f11458feyxiexzfUjhhgtg = this.f11391Ujhhgtgfeyxiexzf;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }
}
