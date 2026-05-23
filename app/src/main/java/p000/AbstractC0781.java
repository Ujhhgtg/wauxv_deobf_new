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

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0781 extends View {

    public int[] f2891;

    public int f2892;

    public Context f2893;

    public AbstractC1532 f2894;

    public String f2895;

    public String f2896;

    public HashMap f2897;

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f2891, this.f2892);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f2895;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f2896;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f2895 = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f2892 = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                m2284(str.substring(i));
                return;
            } else {
                m2284(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f2896 = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f2892 = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                m2286(str.substring(i));
                return;
            } else {
                m2286(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f2895 = null;
        this.f2892 = 0;
        for (int i : iArr) {
            m2285(i);
        }
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.f2895 == null) {
            m2285(i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x005a  */
    public final void m2284(String str) {
        int identifier;
        HashMap map;
        Context context = this.f2893;
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
            Object obj = (false || (map = constraintLayout.f209) == null || !map.containsKey(strTrim)) ? null : constraintLayout.f209.get(strTrim);
            if (obj instanceof Integer) {
                identifier = ((Integer) obj).intValue();
            } else {
                identifier = 0;
            }
        }
        if (identifier == 0 && constraintLayout != null) {
            identifier = m2288(constraintLayout, strTrim);
        }
        if (identifier == 0) {
            try {
                identifier = AbstractC2460.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (identifier == 0) {
            identifier = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
        }
        if (identifier != 0) {
            this.f2897.put(Integer.valueOf(identifier), strTrim);
            m2285(identifier);
        } else {
            Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
        }
    }

    public final void m2285(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.f2892 + 1;
        int[] iArr = this.f2891;
        if (i2 > iArr.length) {
            this.f2891 = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f2891;
        int i3 = this.f2892;
        iArr2[i3] = i;
        this.f2892 = i3 + 1;
    }

    public final void m2286(String str) {
        if (str == null || str.length() == 0 || this.f2893 == null) {
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
            if ((layoutParams instanceof C0783) && strTrim.equals(((C0783) layoutParams).f2945)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    m2285(childAt.getId());
                }
            }
        }
    }

    public final void m2287() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) parent;
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.f2892; i++) {
            View view = (View) constraintLayout.f197.get(this.f2891[i]);
            if (view != null) {
                view.setVisibility(visibility);
                if (elevation > 0.0f) {
                    view.setTranslationZ(view.getTranslationZ() + elevation);
                }
            }
        }
    }

    public final int m2288(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str != null && (resources = this.f2893.getResources()) != null) {
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

    public void mo2289(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC2461.f7810);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 19) {
                    String string = typedArrayObtainStyledAttributes.getString(19);
                    this.f2895 = string;
                    setIds(string);
                } else if (index == 20) {
                    String string2 = typedArrayObtainStyledAttributes.getString(20);
                    this.f2896 = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public abstract void mo51(C0793 c0793, boolean z);

    public final void m2290() {
        if (this.f2894 == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof C0783) {
            ((C0783) layoutParams).f2961 = this.f2894;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }
}
