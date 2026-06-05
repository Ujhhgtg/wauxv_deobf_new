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
import com.google.android.material.timepicker.C0041Ujhhgtgfeyxiexzf;
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
import p000.AbstractC0799feyxiexzfUjhhgtg;
import p000.AbstractC1243feyxiexzfUjhhgtg;
import p000.AbstractC1901feyxiexzfUjhhgtg;
import p000.AbstractC1937feyxiexzfUjhhgtg;
import p000.AbstractC3612feyxiexzfUjhhgtg;
import p000.C0187Ujhhgtgfeyxiexzf;
import p000.C0191Ujhhgtgfeyxiexzf;
import p000.C0709Ujhhgtgfeyxiexzf;
import p000.C1014feyxiexzfUjhhgtg;
import p000.C1017feyxiexzfUjhhgtg;
import p000.C2913feyxiexzfUjhhgtg;
import p000.C2923Ujhhgtgfeyxiexzf;
import p000.C2962feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public static final /* synthetic */ int f710Ujhhgtgfeyxiexzf = 0;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final ArrayList f711Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C0709Ujhhgtgfeyxiexzf f712Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final LinkedHashSet f713Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final C0191Ujhhgtgfeyxiexzf f714Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public Integer[] f715Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public boolean f716Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public boolean f717Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public boolean f718Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final int f719Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public HashSet f720Ujhhgtgfeyxiexzf;

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(AbstractC3612feyxiexzfUjhhgtg.m5250Ujhhgtgfeyxiexzf(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.f711Ujhhgtgfeyxiexzf = new ArrayList();
        this.f712Ujhhgtgfeyxiexzf = new C0709Ujhhgtgfeyxiexzf((Object) this);
        this.f713Ujhhgtgfeyxiexzf = new LinkedHashSet();
        this.f714Ujhhgtgfeyxiexzf = new C0191Ujhhgtgfeyxiexzf(this);
        this.f716Ujhhgtgfeyxiexzf = false;
        this.f720Ujhhgtgfeyxiexzf = new HashSet();
        TypedArray typedArrayM2740Ujhhgtgfeyxiexzf = AbstractC1243feyxiexzfUjhhgtg.m2740Ujhhgtgfeyxiexzf(getContext(), attributeSet, AbstractC0799feyxiexzfUjhhgtg.f3130Ujhhgtgfeyxiexzf, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(typedArrayM2740Ujhhgtgfeyxiexzf.getBoolean(3, false));
        this.f719Ujhhgtgfeyxiexzf = typedArrayM2740Ujhhgtgfeyxiexzf.getResourceId(1, -1);
        this.f718Ujhhgtgfeyxiexzf = typedArrayM2740Ujhhgtgfeyxiexzf.getBoolean(2, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayM2740Ujhhgtgfeyxiexzf.getBoolean(0, true));
        typedArrayM2740Ujhhgtgfeyxiexzf.recycle();
        Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
        setImportantForAccessibility(1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (m805Ujhhgtgfeyxiexzf(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (m805Ujhhgtgfeyxiexzf(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && m805Ujhhgtgfeyxiexzf(i2)) {
                i++;
            }
        }
        return i;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
            materialButton.setId(View.generateViewId());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f712Ujhhgtgfeyxiexzf);
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
        m804Ujhhgtgfeyxiexzf(materialButton.getId(), materialButton.f707Ujhhgtgfeyxiexzf);
        C1017feyxiexzfUjhhgtg shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f711Ujhhgtgfeyxiexzf.add(new C0187Ujhhgtgfeyxiexzf(shapeAppearanceModel.f3977Ujhhgtgfeyxiexzf, shapeAppearanceModel.f3980Ujhhgtgfeyxiexzf, shapeAppearanceModel.f3978Ujhhgtgfeyxiexzf, shapeAppearanceModel.f3979Ujhhgtgfeyxiexzf));
        materialButton.setEnabled(isEnabled());
        AbstractC1901feyxiexzfUjhhgtg.m3265Ujhhgtgfeyxiexzf(materialButton, new C2913feyxiexzfUjhhgtg(this, 1));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f714Ujhhgtgfeyxiexzf);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put((MaterialButton) getChildAt(i), Integer.valueOf(i));
        }
        this.f715Ujhhgtgfeyxiexzf = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public int getCheckedButtonId() {
        if (!this.f717Ujhhgtgfeyxiexzf || this.f720Ujhhgtgfeyxiexzf.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f720Ujhhgtgfeyxiexzf.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            if (this.f720Ujhhgtgfeyxiexzf.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.f715Ujhhgtgfeyxiexzf;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i2;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f719Ujhhgtgfeyxiexzf;
        if (i != -1) {
            m806Ujhhgtgfeyxiexzf(Collections.singleton(Integer.valueOf(i)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) C2962feyxiexzfUjhhgtg.m4428Ujhhgtgfeyxiexzf(1, getVisibleButtonCount(), this.f717Ujhhgtgfeyxiexzf ? 1 : 2).f9271Ujhhgtgfeyxiexzf);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        m807Ujhhgtgfeyxiexzf();
        m803Ujhhgtgfeyxiexzf();
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
            this.f711Ujhhgtgfeyxiexzf.remove(iIndexOfChild);
        }
        m807Ujhhgtgfeyxiexzf();
        m803Ujhhgtgfeyxiexzf();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setEnabled(z);
        }
    }

    public void setSelectionRequired(boolean z) {
        this.f718Ujhhgtgfeyxiexzf = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.f717Ujhhgtgfeyxiexzf != z) {
            this.f717Ujhhgtgfeyxiexzf = z;
            m806Ujhhgtgfeyxiexzf(new HashSet());
        }
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setA11yClassName((this.f717Ujhhgtgfeyxiexzf ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m803Ujhhgtgfeyxiexzf() {
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
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
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

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void m804Ujhhgtgfeyxiexzf(int i, boolean z) {
        if (i == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i);
            return;
        }
        HashSet hashSet = new HashSet(this.f720Ujhhgtgfeyxiexzf);
        if (z && !hashSet.contains(Integer.valueOf(i))) {
            if (this.f717Ujhhgtgfeyxiexzf && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else {
            if (z || !hashSet.contains(Integer.valueOf(i))) {
                return;
            }
            if (!this.f718Ujhhgtgfeyxiexzf || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        }
        m806Ujhhgtgfeyxiexzf(hashSet);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final boolean m805Ujhhgtgfeyxiexzf(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final void m806Ujhhgtgfeyxiexzf(Set set) {
        HashSet hashSet = this.f720Ujhhgtgfeyxiexzf;
        this.f720Ujhhgtgfeyxiexzf = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            boolean zContains = set.contains(Integer.valueOf(id));
            View viewFindViewById = findViewById(id);
            if (viewFindViewById instanceof MaterialButton) {
                this.f716Ujhhgtgfeyxiexzf = true;
                ((MaterialButton) viewFindViewById).setChecked(zContains);
                this.f716Ujhhgtgfeyxiexzf = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator it = this.f713Ujhhgtgfeyxiexzf.iterator();
                while (it.hasNext()) {
                    ((C0041Ujhhgtgfeyxiexzf) it.next()).m867Ujhhgtgfeyxiexzf();
                }
            }
        }
        invalidate();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final void m807Ujhhgtgfeyxiexzf() {
        C0187Ujhhgtgfeyxiexzf c0187Ujhhgtgfeyxiexzf;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            if (materialButton.getVisibility() != 8) {
                C1014feyxiexzfUjhhgtg c1014feyxiexzfUjhhgtgM2514Ujhhgtgfeyxiexzf = materialButton.getShapeAppearanceModel().m2514Ujhhgtgfeyxiexzf();
                C0187Ujhhgtgfeyxiexzf c0187Ujhhgtgfeyxiexzf2 = (C0187Ujhhgtgfeyxiexzf) this.f711Ujhhgtgfeyxiexzf.get(i);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z = getOrientation() == 0;
                    C2923Ujhhgtgfeyxiexzf c2923Ujhhgtgfeyxiexzf = C0187Ujhhgtgfeyxiexzf.f1392Ujhhgtgfeyxiexzf;
                    if (i == firstVisibleChildIndex) {
                        c0187Ujhhgtgfeyxiexzf = z ? AbstractC1937feyxiexzfUjhhgtg.m3282Ujhhgtgfeyxiexzf(this) ? new C0187Ujhhgtgfeyxiexzf(c2923Ujhhgtgfeyxiexzf, c2923Ujhhgtgfeyxiexzf, c0187Ujhhgtgfeyxiexzf2.f1394Ujhhgtgfeyxiexzf, c0187Ujhhgtgfeyxiexzf2.f1395Ujhhgtgfeyxiexzf) : new C0187Ujhhgtgfeyxiexzf(c0187Ujhhgtgfeyxiexzf2.f1393Ujhhgtgfeyxiexzf, c0187Ujhhgtgfeyxiexzf2.f1396Ujhhgtgfeyxiexzf, c2923Ujhhgtgfeyxiexzf, c2923Ujhhgtgfeyxiexzf) : new C0187Ujhhgtgfeyxiexzf(c0187Ujhhgtgfeyxiexzf2.f1393Ujhhgtgfeyxiexzf, c2923Ujhhgtgfeyxiexzf, c0187Ujhhgtgfeyxiexzf2.f1394Ujhhgtgfeyxiexzf, c2923Ujhhgtgfeyxiexzf);
                    } else if (i != lastVisibleChildIndex) {
                        c0187Ujhhgtgfeyxiexzf2 = null;
                    } else if (z) {
                        c0187Ujhhgtgfeyxiexzf = AbstractC1937feyxiexzfUjhhgtg.m3282Ujhhgtgfeyxiexzf(this) ? new C0187Ujhhgtgfeyxiexzf(c0187Ujhhgtgfeyxiexzf2.f1393Ujhhgtgfeyxiexzf, c0187Ujhhgtgfeyxiexzf2.f1396Ujhhgtgfeyxiexzf, c2923Ujhhgtgfeyxiexzf, c2923Ujhhgtgfeyxiexzf) : new C0187Ujhhgtgfeyxiexzf(c2923Ujhhgtgfeyxiexzf, c2923Ujhhgtgfeyxiexzf, c0187Ujhhgtgfeyxiexzf2.f1394Ujhhgtgfeyxiexzf, c0187Ujhhgtgfeyxiexzf2.f1395Ujhhgtgfeyxiexzf);
                    } else {
                        c0187Ujhhgtgfeyxiexzf = new C0187Ujhhgtgfeyxiexzf(c2923Ujhhgtgfeyxiexzf, c0187Ujhhgtgfeyxiexzf2.f1396Ujhhgtgfeyxiexzf, c2923Ujhhgtgfeyxiexzf, c0187Ujhhgtgfeyxiexzf2.f1395Ujhhgtgfeyxiexzf);
                    }
                    c0187Ujhhgtgfeyxiexzf2 = c0187Ujhhgtgfeyxiexzf;
                }
                if (c0187Ujhhgtgfeyxiexzf2 == null) {
                    c1014feyxiexzfUjhhgtgM2514Ujhhgtgfeyxiexzf.m2508Ujhhgtgfeyxiexzf(0.0f);
                } else {
                    c1014feyxiexzfUjhhgtgM2514Ujhhgtgfeyxiexzf.f3952Ujhhgtgfeyxiexzf = c0187Ujhhgtgfeyxiexzf2.f1393Ujhhgtgfeyxiexzf;
                    c1014feyxiexzfUjhhgtgM2514Ujhhgtgfeyxiexzf.f3955Ujhhgtgfeyxiexzf = c0187Ujhhgtgfeyxiexzf2.f1396Ujhhgtgfeyxiexzf;
                    c1014feyxiexzfUjhhgtgM2514Ujhhgtgfeyxiexzf.f3953Ujhhgtgfeyxiexzf = c0187Ujhhgtgfeyxiexzf2.f1394Ujhhgtgfeyxiexzf;
                    c1014feyxiexzfUjhhgtgM2514Ujhhgtgfeyxiexzf.f3954Ujhhgtgfeyxiexzf = c0187Ujhhgtgfeyxiexzf2.f1395Ujhhgtgfeyxiexzf;
                }
                materialButton.setShapeAppearanceModel(c1014feyxiexzfUjhhgtgM2514Ujhhgtgfeyxiexzf.m2507Ujhhgtgfeyxiexzf());
            }
        }
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
