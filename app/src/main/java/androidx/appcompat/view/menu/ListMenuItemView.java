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
import p000.AbstractC0801feyxiexzfUjhhgtg;
import p000.C2366Ujhhgtgfeyxiexzf;
import p000.InterfaceC0367Ujhhgtgfeyxiexzf;
import p000.MenuC0355Ujhhgtgfeyxiexzf;
import p000.MenuItemC0357Ujhhgtgfeyxiexzf;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC0367Ujhhgtgfeyxiexzf, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public MenuItemC0357Ujhhgtgfeyxiexzf f14Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public ImageView f15Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public RadioButton f16Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public TextView f17Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public CheckBox f18Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public TextView f19Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public ImageView f20Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public ImageView f21Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public LinearLayout f22Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final Drawable f23Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public final int f24Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public final Context f25Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public boolean f26Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final Drawable f27Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final boolean f28Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public LayoutInflater f29Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public boolean f30Ujhhgtgfeyxiexzf;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C2366Ujhhgtgfeyxiexzf c2366UjhhgtgfeyxiexzfM3592Ujhhgtgfeyxiexzf = C2366Ujhhgtgfeyxiexzf.m3592Ujhhgtgfeyxiexzf(getContext(), attributeSet, AbstractC0801feyxiexzfUjhhgtg.f3172Ujhhgtgfeyxiexzf, R.attr.listMenuViewStyle);
        this.f23Ujhhgtgfeyxiexzf = c2366UjhhgtgfeyxiexzfM3592Ujhhgtgfeyxiexzf.m3602Ujhhgtgfeyxiexzf(5);
        TypedArray typedArray = (TypedArray) c2366UjhhgtgfeyxiexzfM3592Ujhhgtgfeyxiexzf.f7714Ujhhgtgfeyxiexzf;
        this.f24Ujhhgtgfeyxiexzf = typedArray.getResourceId(1, -1);
        this.f26Ujhhgtgfeyxiexzf = typedArray.getBoolean(7, false);
        this.f25Ujhhgtgfeyxiexzf = context;
        this.f27Ujhhgtgfeyxiexzf = c2366UjhhgtgfeyxiexzfM3592Ujhhgtgfeyxiexzf.m3602Ujhhgtgfeyxiexzf(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f28Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.hasValue(0);
        c2366UjhhgtgfeyxiexzfM3592Ujhhgtgfeyxiexzf.m3611Ujhhgtgfeyxiexzf();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f29Ujhhgtgfeyxiexzf == null) {
            this.f29Ujhhgtgfeyxiexzf = LayoutInflater.from(getContext());
        }
        return this.f29Ujhhgtgfeyxiexzf;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f20Ujhhgtgfeyxiexzf;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f21Ujhhgtgfeyxiexzf;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f21Ujhhgtgfeyxiexzf.getLayoutParams();
        rect.top = this.f21Ujhhgtgfeyxiexzf.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // p000.InterfaceC0367Ujhhgtgfeyxiexzf
    public MenuItemC0357Ujhhgtgfeyxiexzf getItemData() {
        return this.f14Ujhhgtgfeyxiexzf;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f23Ujhhgtgfeyxiexzf);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f17Ujhhgtgfeyxiexzf = textView;
        int i = this.f24Ujhhgtgfeyxiexzf;
        if (i != -1) {
            textView.setTextAppearance(this.f25Ujhhgtgfeyxiexzf, i);
        }
        this.f19Ujhhgtgfeyxiexzf = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f20Ujhhgtgfeyxiexzf = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f27Ujhhgtgfeyxiexzf);
        }
        this.f21Ujhhgtgfeyxiexzf = (ImageView) findViewById(R.id.group_divider);
        this.f22Ujhhgtgfeyxiexzf = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.f15Ujhhgtgfeyxiexzf != null && this.f26Ujhhgtgfeyxiexzf) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f15Ujhhgtgfeyxiexzf.getLayoutParams();
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
        if (!z && this.f16Ujhhgtgfeyxiexzf == null && this.f18Ujhhgtgfeyxiexzf == null) {
            return;
        }
        if ((this.f14Ujhhgtgfeyxiexzf.f2047Ujhhgtgfeyxiexzf & 4) != 0) {
            if (this.f16Ujhhgtgfeyxiexzf == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f16Ujhhgtgfeyxiexzf = radioButton;
                LinearLayout linearLayout = this.f22Ujhhgtgfeyxiexzf;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f16Ujhhgtgfeyxiexzf;
            view = this.f18Ujhhgtgfeyxiexzf;
        } else {
            if (this.f18Ujhhgtgfeyxiexzf == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f18Ujhhgtgfeyxiexzf = checkBox;
                LinearLayout linearLayout2 = this.f22Ujhhgtgfeyxiexzf;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f18Ujhhgtgfeyxiexzf;
            view = this.f16Ujhhgtgfeyxiexzf;
        }
        if (z) {
            compoundButton.setChecked(this.f14Ujhhgtgfeyxiexzf.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f18Ujhhgtgfeyxiexzf;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f16Ujhhgtgfeyxiexzf;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if ((this.f14Ujhhgtgfeyxiexzf.f2047Ujhhgtgfeyxiexzf & 4) != 0) {
            if (this.f16Ujhhgtgfeyxiexzf == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f16Ujhhgtgfeyxiexzf = radioButton;
                LinearLayout linearLayout = this.f22Ujhhgtgfeyxiexzf;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f16Ujhhgtgfeyxiexzf;
        } else {
            if (this.f18Ujhhgtgfeyxiexzf == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f18Ujhhgtgfeyxiexzf = checkBox;
                LinearLayout linearLayout2 = this.f22Ujhhgtgfeyxiexzf;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f18Ujhhgtgfeyxiexzf;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f30Ujhhgtgfeyxiexzf = z;
        this.f26Ujhhgtgfeyxiexzf = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f21Ujhhgtgfeyxiexzf;
        if (imageView != null) {
            imageView.setVisibility((this.f28Ujhhgtgfeyxiexzf || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        MenuC0355Ujhhgtgfeyxiexzf menuC0355Ujhhgtgfeyxiexzf = this.f14Ujhhgtgfeyxiexzf.f2037Ujhhgtgfeyxiexzf;
        boolean z = this.f30Ujhhgtgfeyxiexzf;
        if (z || this.f26Ujhhgtgfeyxiexzf) {
            ImageView imageView = this.f15Ujhhgtgfeyxiexzf;
            if (imageView == null && drawable == null && !this.f26Ujhhgtgfeyxiexzf) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f15Ujhhgtgfeyxiexzf = imageView2;
                LinearLayout linearLayout = this.f22Ujhhgtgfeyxiexzf;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f26Ujhhgtgfeyxiexzf) {
                this.f15Ujhhgtgfeyxiexzf.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f15Ujhhgtgfeyxiexzf;
            if (!z) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f15Ujhhgtgfeyxiexzf.getVisibility() != 0) {
                this.f15Ujhhgtgfeyxiexzf.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f17Ujhhgtgfeyxiexzf.getVisibility() != 8) {
                this.f17Ujhhgtgfeyxiexzf.setVisibility(8);
            }
        } else {
            this.f17Ujhhgtgfeyxiexzf.setText(charSequence);
            if (this.f17Ujhhgtgfeyxiexzf.getVisibility() != 0) {
                this.f17Ujhhgtgfeyxiexzf.setVisibility(0);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0035  */
    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    /* JADX WARN: Code duplicated, block: B:28:0x0058  */
    @Override // p000.InterfaceC0367Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final void mo2Ujhhgtgfeyxiexzf(MenuItemC0357Ujhhgtgfeyxiexzf menuItemC0357Ujhhgtgfeyxiexzf) {
        boolean z;
        int i;
        String string;
        boolean z2;
        this.f14Ujhhgtgfeyxiexzf = menuItemC0357Ujhhgtgfeyxiexzf;
        boolean zIsVisible = menuItemC0357Ujhhgtgfeyxiexzf.isVisible();
        MenuC0355Ujhhgtgfeyxiexzf menuC0355Ujhhgtgfeyxiexzf = menuItemC0357Ujhhgtgfeyxiexzf.f2037Ujhhgtgfeyxiexzf;
        setVisibility(zIsVisible ? 0 : 8);
        setTitle(menuItemC0357Ujhhgtgfeyxiexzf.f2028Ujhhgtgfeyxiexzf);
        setCheckable(menuItemC0357Ujhhgtgfeyxiexzf.isCheckable());
        if (menuC0355Ujhhgtgfeyxiexzf.mo1555Ujhhgtgfeyxiexzf()) {
            if ((menuC0355Ujhhgtgfeyxiexzf.mo1554Ujhhgtgfeyxiexzf() ? menuItemC0357Ujhhgtgfeyxiexzf.f2033Ujhhgtgfeyxiexzf : menuItemC0357Ujhhgtgfeyxiexzf.f2031Ujhhgtgfeyxiexzf) != 0) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        menuC0355Ujhhgtgfeyxiexzf.mo1554Ujhhgtgfeyxiexzf();
        if (z) {
            MenuItemC0357Ujhhgtgfeyxiexzf menuItemC0357Ujhhgtgfeyxiexzf2 = this.f14Ujhhgtgfeyxiexzf;
            MenuC0355Ujhhgtgfeyxiexzf menuC0355Ujhhgtgfeyxiexzf2 = menuItemC0357Ujhhgtgfeyxiexzf2.f2037Ujhhgtgfeyxiexzf;
            if (menuC0355Ujhhgtgfeyxiexzf2.mo1555Ujhhgtgfeyxiexzf()) {
                if ((menuC0355Ujhhgtgfeyxiexzf2.mo1554Ujhhgtgfeyxiexzf() ? menuItemC0357Ujhhgtgfeyxiexzf2.f2033Ujhhgtgfeyxiexzf : menuItemC0357Ujhhgtgfeyxiexzf2.f2031Ujhhgtgfeyxiexzf) != 0) {
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
            TextView textView = this.f19Ujhhgtgfeyxiexzf;
            MenuItemC0357Ujhhgtgfeyxiexzf menuItemC0357Ujhhgtgfeyxiexzf3 = this.f14Ujhhgtgfeyxiexzf;
            MenuC0355Ujhhgtgfeyxiexzf menuC0355Ujhhgtgfeyxiexzf3 = menuItemC0357Ujhhgtgfeyxiexzf3.f2037Ujhhgtgfeyxiexzf;
            Context context = menuC0355Ujhhgtgfeyxiexzf3.f2004Ujhhgtgfeyxiexzf;
            char c = menuC0355Ujhhgtgfeyxiexzf3.mo1554Ujhhgtgfeyxiexzf() ? menuItemC0357Ujhhgtgfeyxiexzf3.f2033Ujhhgtgfeyxiexzf : menuItemC0357Ujhhgtgfeyxiexzf3.f2031Ujhhgtgfeyxiexzf;
            if (c == 0) {
                string = "";
            } else {
                Resources resources = context.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(context).hasPermanentMenuKey()) {
                    sb.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                int i2 = menuC0355Ujhhgtgfeyxiexzf3.mo1554Ujhhgtgfeyxiexzf() ? menuItemC0357Ujhhgtgfeyxiexzf3.f2034Ujhhgtgfeyxiexzf : menuItemC0357Ujhhgtgfeyxiexzf3.f2032Ujhhgtgfeyxiexzf;
                MenuItemC0357Ujhhgtgfeyxiexzf.m1561Ujhhgtgfeyxiexzf(sb, i2, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
                MenuItemC0357Ujhhgtgfeyxiexzf.m1561Ujhhgtgfeyxiexzf(sb, i2, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
                MenuItemC0357Ujhhgtgfeyxiexzf.m1561Ujhhgtgfeyxiexzf(sb, i2, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
                MenuItemC0357Ujhhgtgfeyxiexzf.m1561Ujhhgtgfeyxiexzf(sb, i2, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
                MenuItemC0357Ujhhgtgfeyxiexzf.m1561Ujhhgtgfeyxiexzf(sb, i2, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
                MenuItemC0357Ujhhgtgfeyxiexzf.m1561Ujhhgtgfeyxiexzf(sb, i2, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
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
        if (this.f19Ujhhgtgfeyxiexzf.getVisibility() != i) {
            this.f19Ujhhgtgfeyxiexzf.setVisibility(i);
        }
        setIcon(menuItemC0357Ujhhgtgfeyxiexzf.getIcon());
        setEnabled(menuItemC0357Ujhhgtgfeyxiexzf.isEnabled());
        setSubMenuArrowVisible(menuItemC0357Ujhhgtgfeyxiexzf.hasSubMenu());
        setContentDescription(menuItemC0357Ujhhgtgfeyxiexzf.f2040Ujhhgtgfeyxiexzf);
    }
}
