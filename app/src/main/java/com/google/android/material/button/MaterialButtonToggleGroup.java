package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import com.google.android.material.timepicker.C0024;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import me.hd.wauxv.R;
import p000.AbstractC1459;
import p000.AbstractC2467;
import p000.AbstractC2665;
import p000.AbstractC3471;
import p000.AbstractC3578;
import p000.C0053;
import p000.C0684;
import p000.C1744;
import p000.C1908;
import p000.C1909;
import p000.C2021;
import p000.C2677;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    public static final /* synthetic */ int f644 = 0;

    public final ArrayList f645;

    public final C1744 f646;

    public final LinkedHashSet f647;

    public final C1908 f648;

    public Integer[] f649;

    public boolean f650;

    public boolean f651;

    public boolean f652;

    public final int f653;

    public HashSet f654;

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(AbstractC2665.m4673(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.f645 = new ArrayList();
        this.f646 = new C1744((Object) this);
        this.f647 = new LinkedHashSet();
        this.f648 = new C1908(this);
        this.f650 = false;
        this.f654 = new HashSet();
        TypedArray typedArrayM5082 = AbstractC3471.m5082(getContext(), attributeSet, AbstractC2467.f7850, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(typedArrayM5082.getBoolean(3, false));
        this.f653 = typedArrayM5082.getResourceId(1, -1);
        this.f652 = typedArrayM5082.getBoolean(2, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayM5082.getBoolean(0, true));
        typedArrayM5082.recycle();
        Field field = AbstractC3578.f11184;
        setImportantForAccessibility(1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (m663(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (m663(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && m663(i2)) {
                i++;
            }
        }
        return i;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            Field field = AbstractC3578.f11184;
            materialButton.setId(View.generateViewId());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f646);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        m662(materialButton.getId(), materialButton.f641);
        C2677 shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f645.add(new C1909(shapeAppearanceModel.f8632, shapeAppearanceModel.f8635, shapeAppearanceModel.f8633, shapeAppearanceModel.f8634));
        materialButton.setEnabled(isEnabled());
        AbstractC3578.m5177(materialButton, new C0684(this, 1));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f648);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put((MaterialButton) getChildAt(i), Integer.valueOf(i));
        }
        this.f649 = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public int getCheckedButtonId() {
        if (!this.f651 || this.f654.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f654.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            if (this.f654.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.f649;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i2;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f653;
        if (i != -1) {
            m664(Collections.singleton(Integer.valueOf(i)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, getVisibleButtonCount(), false, this.f651 ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        m665();
        m661();
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f645.remove(iIndexOfChild);
        }
        m665();
        m661();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setEnabled(z);
        }
    }

    public void setSelectionRequired(boolean z) {
        this.f652 = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.f651 != z) {
            this.f651 = z;
            m664(new HashSet());
        }
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setA11yClassName((this.f651 ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    public final void m661() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            int iMin = Math.min(materialButton.getStrokeWidth(), ((MaterialButton) getChildAt(i - 1)).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams = materialButton.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                layoutParams2.setMarginEnd(0);
                layoutParams2.setMarginStart(-iMin);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = -iMin;
                layoutParams2.setMarginStart(0);
            }
            materialButton.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || false) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            layoutParams3.setMarginEnd(0);
            layoutParams3.setMarginStart(0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    public final void m662(int i, boolean z) {
        if (i == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: -1");
            return;
        }
        HashSet hashSet = new HashSet(this.f654);
        if (z && !hashSet.contains(Integer.valueOf(i))) {
            if (this.f651 && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else {
            if (z || !hashSet.contains(Integer.valueOf(i))) {
                return;
            }
            if (!this.f652 || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        }
        m664(hashSet);
    }

    public final boolean m663(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    public final void m664(Set set) {
        HashSet hashSet = this.f654;
        this.f654 = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            boolean zContains = set.contains(Integer.valueOf(id));
            View viewFindViewById = findViewById(id);
            if (viewFindViewById instanceof MaterialButton) {
                this.f650 = true;
                ((MaterialButton) viewFindViewById).setChecked(zContains);
                this.f650 = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator it = this.f647.iterator();
                while (it.hasNext()) {
                    ((C0024) it.next()).m724();
                }
            }
        }
        invalidate();
    }

    public final void m665() {
        C1909 c1909;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            if (materialButton.getVisibility() != 8) {
                C2021 c2021M4691 = materialButton.getShapeAppearanceModel().m4691();
                C1909 c19010 = (C1909) this.f645.get(i);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z = getOrientation() == 0;
                    C0053 c0053 = C1909.f6303;
                    if (i == firstVisibleChildIndex) {
                        c1909 = z ? AbstractC1459.m3191(this) ? new C1909(c0053, c0053, c19010.f6305, c19010.f6306) : new C1909(c19010.f6304, c19010.f6307, c0053, c0053) : new C1909(c19010.f6304, c0053, c19010.f6305, c0053);
                    } else if (i != lastVisibleChildIndex) {
                        c19010 = null;
                    } else if (z) {
                        c1909 = AbstractC1459.m3191(this) ? new C1909(c19010.f6304, c19010.f6307, c0053, c0053) : new C1909(c0053, c0053, c19010.f6305, c19010.f6306);
                    } else {
                        c1909 = new C1909(c0053, c19010.f6307, c0053, c19010.f6306);
                    }
                    c19010 = c1909;
                }
                if (c19010 == null) {
                    c2021M4691.f6766 = new C0053(0.0f);
                    c2021M4691.f6767 = new C0053(0.0f);
                    c2021M4691.f6768 = new C0053(0.0f);
                    c2021M4691.f6769 = new C0053(0.0f);
                } else {
                    c2021M4691.f6766 = c19010.f6304;
                    c2021M4691.f6769 = c19010.f6307;
                    c2021M4691.f6767 = c19010.f6305;
                    c2021M4691.f6768 = c19010.f6306;
                }
                materialButton.setShapeAppearanceModel(c2021M4691.m3876());
            }
        }
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
