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
import p000.AbstractC2523;
import p000.C0253;
import p000.InterfaceC1987;
import p000.MenuC1975;
import p000.MenuItemC1977;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC1987, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public MenuItemC1977 f13;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public ImageView f14;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public RadioButton f15;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public TextView f16;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public CheckBox f17;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public TextView f18;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public ImageView f19;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public ImageView f20;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public LinearLayout f21;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final Drawable f22;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final int f23;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final Context f24;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public boolean f25;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final Drawable f26;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final boolean f27;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public LayoutInflater f28;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public boolean f29;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0253 c0253M1453 = C0253.m1453(getContext(), attributeSet, AbstractC2523.f8040, R.attr.listMenuViewStyle);
        this.f22 = c0253M1453.m1466(5);
        TypedArray typedArray = (TypedArray) c0253M1453.f1478;
        this.f23 = typedArray.getResourceId(1, -1);
        this.f25 = typedArray.getBoolean(7, false);
        this.f24 = context;
        this.f26 = c0253M1453.m1466(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f27 = typedArrayObtainStyledAttributes.hasValue(0);
        c0253M1453.m1475();
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

    @Override // p000.InterfaceC1987
    public MenuItemC1977 getItemData() {
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
        if ((this.f13.f6555 & 4) != 0) {
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
        if ((this.f13.f6555 & 4) != 0) {
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
        MenuC1975 menuC1975 = this.f13.f6545;
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
    @Override // p000.InterfaceC1987
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final void mo2(MenuItemC1977 menuItemC1977) {
        boolean z;
        int i;
        String string;
        boolean z2;
        this.f13 = menuItemC1977;
        boolean zIsVisible = menuItemC1977.isVisible();
        MenuC1975 menuC1975 = menuItemC1977.f6545;
        setVisibility(zIsVisible ? 0 : 8);
        setTitle(menuItemC1977.f6536);
        setCheckable(menuItemC1977.isCheckable());
        if (menuC1975.mo3961()) {
            if ((menuC1975.mo3960() ? menuItemC1977.f6541 : menuItemC1977.f6539) != 0) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        menuC1975.mo3960();
        if (z) {
            MenuItemC1977 menuItemC1978 = this.f13;
            MenuC1975 menuC1976 = menuItemC1978.f6545;
            if (menuC1976.mo3961()) {
                if ((menuC1976.mo3960() ? menuItemC1978.f6541 : menuItemC1978.f6539) != 0) {
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
            MenuItemC1977 menuItemC1979 = this.f13;
            MenuC1975 menuC1977 = menuItemC1979.f6545;
            Context context = menuC1977.f6512;
            char c = menuC1977.mo3960() ? menuItemC1979.f6541 : menuItemC1979.f6539;
            if (c == 0) {
                string = "";
            } else {
                Resources resources = context.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(context).hasPermanentMenuKey()) {
                    sb.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                int i2 = menuC1977.mo3960() ? menuItemC1979.f6542 : menuItemC1979.f6540;
                MenuItemC1977.m3967(sb, i2, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
                MenuItemC1977.m3967(sb, i2, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
                MenuItemC1977.m3967(sb, i2, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
                MenuItemC1977.m3967(sb, i2, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
                MenuItemC1977.m3967(sb, i2, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
                MenuItemC1977.m3967(sb, i2, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
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
        setIcon(menuItemC1977.getIcon());
        setEnabled(menuItemC1977.isEnabled());
        setSubMenuArrowVisible(menuItemC1977.hasSubMenu());
        setContentDescription(menuItemC1977.f6548);
    }
}
