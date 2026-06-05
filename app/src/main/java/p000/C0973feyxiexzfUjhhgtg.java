package p000;

import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import com.alibaba.fastjson2.JSONObject;
import java.util.Arrays;
import me.hd.wauxv.data.bean.MsgInfoBean;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛲ能不能要点脸ᛱUjhhgtgᛱᛴᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0973feyxiexzfUjhhgtg extends AbstractC2059Ujhhgtgfeyxiexzf implements InterfaceC0599Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static final C0973feyxiexzfUjhhgtg f3864Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final String f3865Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static final String f3866Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final String f3867Ujhhgtgfeyxiexzf;

    static {
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        f3864Ujhhgtgfeyxiexzf = new C0973feyxiexzfUjhhgtg(MagicFactory.get(4928895015666582922L, strArr));
        f3865Ujhhgtgfeyxiexzf = MagicFactory.get(4928893538197833098L, strArr);
        f3866Ujhhgtgfeyxiexzf = MagicFactory.get(4928893525312931210L, strArr);
        f3867Ujhhgtgfeyxiexzf = MagicFactory.get(4928893495248160138L, strArr);
    }

    @Override // p000.InterfaceC0599Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ */
    public final void mo1535Ujhhgtgfeyxiexzf(View view, Object obj, Object obj2, MsgInfoBean msgInfoBean) {
        if (mo1424feyxiexzfUjhhgtg() && msgInfoBean.isGroupChat() && msgInfoBean.isRedBag()) {
            JSONObject jSONObjectM2619Ujhhgtgfeyxiexzf = AbstractC1150feyxiexzfUjhhgtg.m2619Ujhhgtgfeyxiexzf(msgInfoBean.getContent());
            String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
            Object byPath = jSONObjectM2619Ujhhgtgfeyxiexzf.getByPath(MagicFactory.get(4928895058616255882L, strArr));
            MagicFactory.get(4928894143788221834L, strArr);
            String queryParameter = Uri.parse(((JSONObject) byPath).getString(MagicFactory.get(4928894392896325002L, strArr))).getQueryParameter(MagicFactory.get(4928894487385605514L, strArr));
            if (queryParameter == null) {
                return;
            }
            int[] iArr = msgInfoBean.isSend() ? new int[]{4, 0, 0, 1, 2, 0} : new int[]{4, 1, 0, 1, 1, 2, 0};
            TextView textView = (TextView) AbstractC1896feyxiexzfUjhhgtg.m3231Ujhhgtgfeyxiexzf(view, MagicFactory.get(4928894444435932554L, strArr), Arrays.copyOf(iArr, iArr.length));
            if (textView == null) {
                return;
            }
            textView.setText(((Object) textView.getText()) + '[' + queryParameter + ']');
        }
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ */
    public final String mo1478feyxiexzfUjhhgtg() {
        return f3867Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛴᛱUjhhgtgᛱ */
    public final String mo1479feyxiexzfUjhhgtg() {
        return f3866Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱᛳ */
    public final String mo1480feyxiexzfUjhhgtg() {
        return f3865Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC0571Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ */
    public final void mo1074feyxiexzfUjhhgtg() {
    }
}
