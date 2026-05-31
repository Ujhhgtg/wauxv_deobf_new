package p000;

import android.app.Activity;
import android.content.res.Resources;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import com.kongzue.dialogx.interfaces.AbstractC0034;
import com.kongzue.dialogx.util.views.DialogScrollView;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import com.kongzue.dialogx.util.views.MaxRelativeLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲇᛸᲈᤝᲀᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1992 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final ArrayList f6585;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final DialogXBaseRelativeLayout f6586;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final MaxRelativeLayout f6587;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final TextView f6588;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public InterfaceC2698 f6589;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final TextView f6590;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final ViewGroup f6591;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final RelativeLayout f6592;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final EditText f6593;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final LinearLayout f6594;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final TextView f6595;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final View f6596;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final View f6597;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final TextView f6598;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final TextView f6599;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final /* synthetic */ C1993 f6600;

    public C1992(C1993 c1993, View view) {
        this.f6600 = c1993;
        if (view == null) {
            return;
        }
        c1993.getClass();
        c1993.f975 = new WeakReference(view);
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = (DialogXBaseRelativeLayout) view.findViewById(R.id.box_root);
        this.f6586 = dialogXBaseRelativeLayout;
        this.f6587 = (MaxRelativeLayout) view.findViewById(R.id.bkg);
        TextView textView = (TextView) view.findViewById(R.id.txt_dialog_title);
        this.f6588 = textView;
        this.f6589 = (InterfaceC2698) view.findViewById(R.id.scrollView);
        TextView textView2 = (TextView) view.findViewById(R.id.txt_dialog_tip);
        this.f6590 = textView2;
        this.f6591 = (ViewGroup) view.findViewById(R.id.box_list);
        this.f6592 = (RelativeLayout) view.findViewById(R.id.box_custom);
        this.f6593 = (EditText) view.findViewById(R.id.txt_input);
        this.f6594 = (LinearLayout) view.findViewById(R.id.box_button);
        TextView textView3 = (TextView) view.findViewById(R.id.btn_selectOther);
        this.f6595 = textView3;
        this.f6596 = view.findViewById(R.id.space_other_button);
        this.f6597 = view.findViewWithTag("split");
        TextView textView4 = (TextView) view.findViewById(R.id.btn_selectNegative);
        this.f6598 = textView4;
        TextView textView5 = (TextView) view.findViewById(R.id.btn_selectPositive);
        this.f6599 = textView5;
        this.f6585 = AbstractC0034.m879(view);
        c1993.m897().setTranslationZ(0);
        AbstractC1469 abstractC1469 = AbstractC1037.f3785;
        TextPaint paint = textView.getPaint();
        int i = 1;
        paint.setFakeBoldText(true);
        textView4.getPaint().setFakeBoldText(true);
        textView5.getPaint().setFakeBoldText(true);
        textView3.getPaint().setFakeBoldText(true);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        dialogXBaseRelativeLayout.m907(0.0f);
        dialogXBaseRelativeLayout.m908(c1993.f6603);
        dialogXBaseRelativeLayout.f1003 = new C0937(this, i);
        dialogXBaseRelativeLayout.f1004 = new C1681(this);
        textView5.setOnClickListener(new ViewOnClickListenerC1990(this, 0));
        textView4.setOnClickListener(new ViewOnClickListenerC1990(this, i));
        textView3.setOnClickListener(new ViewOnClickListenerC1990(this, 2));
        c1993.f6616 = this;
        m3982();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m3980(View view) {
        C1993 c1993 = this.f6600;
        c1993.getClass();
        if (view != null) {
            view.setEnabled(false);
        }
        if (c1993.m898() == null || c1993.f989) {
            return;
        }
        int i = 1;
        if (c1993.f6604 == null) {
            c1993.f6604 = new C0941(this, i);
        }
        C0941 c0941 = c1993.f6604;
        if (c0941 != null) {
            c1993.f989 = true;
            if (c0941 == null) {
                c1993.f6604 = new C0941(this, i);
            }
            c1993.f6604.m2553(c1993);
            RunnableC0149 runnableC0149 = new RunnableC0149(this, 12);
            long jM3981 = m3981(null);
            if (jM3981 < 0) {
                return;
            }
            AbstractC1469 abstractC1469 = AbstractC1037.f3785;
            AbstractC0034.m882().postDelayed(runnableC0149, jM3981);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final long m3981(Animation animation) {
        if (animation == null) {
            MaxRelativeLayout maxRelativeLayout = this.f6587;
            if (maxRelativeLayout.getAnimation() != null) {
                animation = maxRelativeLayout.getAnimation();
            }
        }
        long duration = (animation == null || animation.getDuration() == 0) ? 300L : animation.getDuration();
        long j = this.f6600.f986;
        return j != -1 ? j : duration;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m3982() {
        ?? r8;
        int color;
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = this.f6586;
        if (dialogXBaseRelativeLayout != null) {
            C1993 c1993 = this.f6600;
            Activity activityM898 = c1993.m898();
            AbstractC0034 abstractC0034 = c1993.f6603;
            AbstractC1469 abstractC1469 = c1993.f983;
            if (activityM898 == null) {
                return;
            }
            dialogXBaseRelativeLayout.f1000 = c1993.f979;
            int[] iArr = c1993.f988;
            int i = 0;
            int i2 = iArr[0];
            int i3 = 1;
            int i4 = iArr[1];
            int i5 = 2;
            int i6 = iArr[2];
            int i7 = 3;
            int i8 = iArr[3];
            int[] iArr2 = dialogXBaseRelativeLayout.f1015;
            iArr2[0] = i2;
            iArr2[1] = i4;
            iArr2[2] = i6;
            iArr2[3] = i8;
            AbstractC1469 abstractC14610 = AbstractC1037.f3785;
            MaxRelativeLayout maxRelativeLayout = this.f6587;
            maxRelativeLayout.getClass();
            int i9 = c1993.f987;
            if (i9 == 0) {
                i9 = 0;
            }
            if (i9 > 0) {
                maxRelativeLayout.f1023 = i9;
            }
            maxRelativeLayout.setMinimumWidth(0);
            maxRelativeLayout.setMinimumHeight(0);
            View viewFindViewWithTag = dialogXBaseRelativeLayout.findViewWithTag("dialogx_editbox");
            boolean z = abstractC0034 instanceof C1657;
            EditText editText = this.f6593;
            if (z) {
                if (viewFindViewWithTag != null) {
                    viewFindViewWithTag.setVisibility(0);
                }
                editText.setVisibility(0);
                if (editText != dialogXBaseRelativeLayout) {
                    dialogXBaseRelativeLayout.f1011 = new WeakReference(editText);
                }
            } else {
                if (viewFindViewWithTag != null) {
                    viewFindViewWithTag.setVisibility(8);
                }
                editText.setVisibility(8);
            }
            dialogXBaseRelativeLayout.setClickable(true);
            if (c1993.f6612 > -1.0f) {
                maxRelativeLayout.setOutlineProvider(new C0683(this, i3));
                maxRelativeLayout.setClipToOutline(true);
                ArrayList arrayList = this.f6585;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    if (it.hasNext()) {
                        ((View) it.next()).getClass();
                        throw new ClassCastException();
                    }
                }
            }
            CharSequence charSequence = c1993.f6606;
            if (charSequence == null) {
                charSequence = null;
            }
            AbstractC0034.m891(this.f6588, charSequence);
            AbstractC0034.m891(this.f6590, c1993.f6607);
            CharSequence charSequence2 = c1993.f6608;
            TextView textView = this.f6599;
            AbstractC0034.m891(textView, charSequence2);
            CharSequence charSequence3 = c1993.f6609;
            TextView textView2 = this.f6598;
            AbstractC0034.m891(textView2, charSequence3);
            CharSequence charSequence4 = c1993.f6610;
            TextView textView3 = this.f6595;
            AbstractC0034.m891(textView3, charSequence4);
            editText.setText(c1993.f6611);
            editText.setHint((CharSequence) null);
            View view = this.f6596;
            if (view != null) {
                if (c1993.f6610 == null) {
                    view.setVisibility(8);
                } else {
                    view.setVisibility(0);
                }
            }
            LinearLayout linearLayout = this.f6594;
            if (linearLayout != null) {
                linearLayout.setVisibility(((textView2 == null || textView2.getVisibility() != 0) && (textView3 == null || textView3.getVisibility() != 0) && (textView == null || textView.getVisibility() != 0)) ? 8 : 0);
            }
            AbstractC0034.m887(c1993.f6608);
            AbstractC0034.m887(c1993.f6609);
            AbstractC0034.m887(c1993.f6610);
            View view2 = this.f6597;
            if (view2 != null) {
                c1993.m903();
                abstractC1469.getClass();
                if (AbstractC0034.m880() == null) {
                    AbstractC0034.m878("DialogX 未初始化(E7)。\n请检查是否在启动对话框前进行初始化操作，使用以下代码进行初始化：\nDialogX.init(context);\n\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX");
                    color = -16777216;
                } else {
                    color = c1993.m899().getColor(0);
                }
                view2.setBackgroundColor(color);
            }
            linearLayout.setOrientation(0);
            abstractC1469.mo3358();
            if (abstractC1469.mo3358().length != 0) {
                linearLayout.removeAllViews();
                int[] iArrMo3358 = abstractC1469.mo3358();
                int length = iArrMo3358.length;
                while (i < length) {
                    int i10 = iArrMo3358[i];
                    if (i10 == i3) {
                        linearLayout.addView(textView);
                        abstractC1469.mo3360();
                        textView.setBackgroundResource(abstractC1469.mo3360().mo3318(c1993.m903()));
                    } else if (i10 == i5) {
                        linearLayout.addView(textView2);
                        abstractC1469.mo3360();
                        textView2.setBackgroundResource(abstractC1469.mo3360().mo3317(c1993.m903()));
                    } else if (i10 == i7) {
                        linearLayout.addView(textView3);
                        abstractC1469.mo3360();
                        textView3.setBackgroundResource(abstractC1469.mo3360().mo3319(c1993.m903()));
                    } else if (i10 == 4) {
                        int i11 = i3;
                        if (linearLayout.getChildCount() >= i11 && linearLayout.getChildAt(linearLayout.getChildCount() - i11).getVisibility() != 8) {
                            Space space = new Space(c1993.m898());
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                            layoutParams.weight = 1.0f;
                            linearLayout.addView(space, layoutParams);
                        }
                    } else if (i10 == 5 && linearLayout.getChildCount() >= i3 && linearLayout.getChildAt(linearLayout.getChildCount() - i3).getVisibility() != 8) {
                        View view3 = new View(c1993.m898());
                        Resources resourcesM899 = c1993.m899();
                        c1993.m903();
                        abstractC1469.getClass();
                        view3.setBackgroundColor(resourcesM899.getColor(0));
                        abstractC1469.getClass();
                        linearLayout.addView(view3, new LinearLayout.LayoutParams(1, -1));
                    }
                    i++;
                    i3 = 1;
                    i5 = 2;
                    i7 = 3;
                }
            }
            if (c1993.f6601) {
                if (c1993.mo3532()) {
                    dialogXBaseRelativeLayout.setOnClickListener(new ViewOnClickListenerC1990(this, 3));
                } else {
                    dialogXBaseRelativeLayout.setOnClickListener(null);
                }
                r8 = 0;
            } else {
                r8 = 0;
                dialogXBaseRelativeLayout.setClickable(false);
            }
            C2036 c2036 = c1993.f6602;
            RelativeLayout relativeLayout = this.f6592;
            if (c2036 == null || c2036.m3854() == null) {
                relativeLayout.setVisibility(8);
                return;
            }
            c1993.f6602.m3850(relativeLayout, abstractC0034);
            relativeLayout.setVisibility(r8);
            if (c1993.f6602.m3854() instanceof InterfaceC2698) {
                InterfaceC2698 interfaceC2698 = this.f6589;
                if (interfaceC2698 instanceof DialogScrollView) {
                    ((DialogScrollView) interfaceC2698).setVerticalScrollBarEnabled(r8);
                }
                this.f6589 = (InterfaceC2698) c1993.f6602.m3854();
                return;
            }
            KeyEvent.Callback callbackFindViewWithTag = c1993.f6602.m3854().findViewWithTag("ScrollController");
            if (callbackFindViewWithTag instanceof InterfaceC2698) {
                InterfaceC2698 interfaceC2699 = this.f6589;
                if (interfaceC2699 instanceof DialogScrollView) {
                    ((DialogScrollView) interfaceC2699).setVerticalScrollBarEnabled(false);
                }
                this.f6589 = (InterfaceC2698) callbackFindViewWithTag;
            }
        }
    }
}
