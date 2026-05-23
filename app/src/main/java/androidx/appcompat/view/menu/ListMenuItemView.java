package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import me.hd.wauxv.R;
import p000.AbstractC2470;
import p000.C0243;
import p000.InterfaceC1956;
import p000.MenuC1944;
import p000.MenuItemC1946;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC1956, AbsListView.SelectionBoundsAdjuster {

    public MenuItemC1946 f13;

    public ImageView f14;

    public RadioButton f15;

    public TextView f16;

    public CheckBox f17;

    public TextView f18;

    public ImageView f19;

    public ImageView f20;

    public LinearLayout f21;

    public final Drawable f22;

    public final int f23;

    public final Context f24;

    public boolean f25;

    public final Drawable f26;

    public final boolean f27;

    public LayoutInflater f28;

    public boolean f29;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0243 c0243M1307 = C0243.m1307(getContext(), attributeSet, AbstractC2470.f7891, R.attr.listMenuViewStyle);
        this.f22 = c0243M1307.m1320(5);
        TypedArray typedArray = (TypedArray) c0243M1307.f1404;
        this.f23 = typedArray.getResourceId(1, -1);
        this.f25 = typedArray.getBoolean(7, false);
        this.f24 = context;
        this.f26 = c0243M1307.m1320(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, R.attr.dropDownListViewStyle, 0);
        this.f27 = typedArrayObtainStyledAttributes.hasValue(0);
        c0243M1307.m1329();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f28 == null) {
            this.f28 = LayoutInflater.from(getContext());
        }
        return this.f28;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f19;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f20;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f20.getLayoutParams();
        rect.top = this.f20.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // p000.InterfaceC1956
    public MenuItemC1946 getItemData() {
        return this.f13;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f22);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f16 = textView;
        int i = this.f23;
        if (i != -1) {
            textView.setTextAppearance(this.f24, i);
        }
        this.f18 = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f19 = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f26);
        }
        this.f20 = (ImageView) findViewById(R.id.group_divider);
        this.f21 = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.f14 != null && this.f25) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f14.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        View view;
        if (!z && this.f15 == null && this.f17 == null) {
            return;
        }
        if ((this.f13.f6450 & 4) != 0) {
            if (this.f15 == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f15 = radioButton;
                LinearLayout linearLayout = this.f21;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f15;
            view = this.f17;
        } else {
            if (this.f17 == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f17 = checkBox;
                LinearLayout linearLayout2 = this.f21;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f17;
            view = this.f15;
        }
        if (z) {
            compoundButton.setChecked(this.f13.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f17;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f15;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if ((this.f13.f6450 & 4) != 0) {
            if (this.f15 == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f15 = radioButton;
                LinearLayout linearLayout = this.f21;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f15;
        } else {
            if (this.f17 == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f17 = checkBox;
                LinearLayout linearLayout2 = this.f21;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f17;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f29 = z;
        this.f25 = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f20;
        if (imageView != null) {
            imageView.setVisibility((this.f27 || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        MenuC1944 menuC1944 = this.f13.f6440;
        boolean z = this.f29;
        if (z || this.f25) {
            ImageView imageView = this.f14;
            if (imageView == null && drawable == null && !this.f25) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f14 = imageView2;
                LinearLayout linearLayout = this.f21;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f25) {
                this.f14.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f14;
            if (!z) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f14.getVisibility() != 0) {
                this.f14.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f16.getVisibility() != 8) {
                this.f16.setVisibility(8);
            }
        } else {
            this.f16.setText(charSequence);
            if (this.f16.getVisibility() != 0) {
                this.f16.setVisibility(0);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0035  */
    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    /* JADX WARN: Code duplicated, block: B:28:0x0058  */
    @Override // p000.InterfaceC1956
    public final void mo2(MenuItemC1946 menuItemC1946) {
        boolean z;
        int i;
        String string;
        boolean z2;
        this.f13 = menuItemC1946;
        boolean zIsVisible = menuItemC1946.isVisible();
        MenuC1944 menuC1944 = menuItemC1946.f6440;
        setVisibility(zIsVisible ? 0 : 8);
        setTitle(menuItemC1946.f6431);
        setCheckable(menuItemC1946.isCheckable());
        if (menuC1944.mo3767()) {
            if ((menuC1944.mo3766() ? menuItemC1946.f6436 : menuItemC1946.f6434) != 0) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        menuC1944.mo3766();
        if (z) {
            MenuItemC1946 menuItemC1947 = this.f13;
            MenuC1944 menuC1945 = menuItemC1947.f6440;
            if (menuC1945.mo3767()) {
                if ((menuC1945.mo3766() ? menuItemC1947.f6436 : menuItemC1947.f6434) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            i = z2 ? 0 : 8;
        }
        if (i == 0) {
            TextView textView = this.f18;
            MenuItemC1946 menuItemC1948 = this.f13;
            MenuC1944 menuC1946 = menuItemC1948.f6440;
            Context context = menuC1946.f6407;
            char c = menuC1946.mo3766() ? menuItemC1948.f6436 : menuItemC1948.f6434;
            if (c == 0) {
                string = "";
            } else {
                Resources resources = context.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(context).hasPermanentMenuKey()) {
                    sb.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                int i2 = menuC1946.mo3766() ? menuItemC1948.f6437 : menuItemC1948.f6435;
                MenuItemC1946.m3773(sb, i2, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
                MenuItemC1946.m3773(sb, i2, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
                MenuItemC1946.m3773(sb, i2, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
                MenuItemC1946.m3773(sb, i2, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
                MenuItemC1946.m3773(sb, i2, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
                MenuItemC1946.m3773(sb, i2, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
                if (c == '\b') {
                    sb.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                } else if (c == '\n') {
                    sb.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                } else if (c != ' ') {
                    sb.append(c);
                } else {
                    sb.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                }
                string = sb.toString();
            }
            textView.setText(string);
        }
        if (this.f18.getVisibility() != i) {
            this.f18.setVisibility(i);
        }
        setIcon(menuItemC1946.getIcon());
        setEnabled(menuItemC1946.isEnabled());
        setSubMenuArrowVisible(menuItemC1946.hasSubMenu());
        setContentDescription(menuItemC1946.f6443);
    }
}
