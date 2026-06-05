package p000;

import android.content.Context;
import com.drake.net.exception.ConvertException;
import com.drake.net.exception.DownloadFileException;
import com.drake.net.exception.HttpFailureException;
import com.drake.net.exception.NetConnectException;
import com.drake.net.exception.NetException;
import com.drake.net.exception.NetSocketTimeoutException;
import com.drake.net.exception.NoCacheException;
import com.drake.net.exception.RequestParamsException;
import com.drake.net.exception.ResponseException;
import com.drake.net.exception.ServerResponseException;
import com.drake.net.exception.URLParseException;
import java.net.UnknownHostException;
import java.util.concurrent.CancellationException;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛴᛲᛳ要点脸能不能ᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C0438Ujhhgtgfeyxiexzf extends C3027feyxiexzfUjhhgtg {
    @Override // p000.C3027feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void mo1768Ujhhgtgfeyxiexzf(CancellationException cancellationException) {
        AbstractC1243feyxiexzfUjhhgtg.m2729Ujhhgtgfeyxiexzf(this.f9392Ujhhgtgfeyxiexzf);
        super.mo1768Ujhhgtgfeyxiexzf(null);
    }

    @Override // p000.C3027feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public final void mo1769Ujhhgtgfeyxiexzf(Throwable th) {
        mo1770feyxiexzfUjhhgtg(th);
    }

    @Override // p000.C3027feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void mo1770feyxiexzfUjhhgtg(Throwable th) {
        String string;
        AbstractC0427Ujhhgtgfeyxiexzf.f2282Ujhhgtgfeyxiexzf.getClass();
        if (th instanceof UnknownHostException) {
            Context context = AbstractC0427Ujhhgtgfeyxiexzf.f2275Ujhhgtgfeyxiexzf;
            string = (context != null ? context : null).getString(R.string.net_host_error);
        } else if (th instanceof URLParseException) {
            Context context2 = AbstractC0427Ujhhgtgfeyxiexzf.f2275Ujhhgtgfeyxiexzf;
            string = (context2 != null ? context2 : null).getString(R.string.net_url_error);
        } else if (th instanceof NetConnectException) {
            Context context3 = AbstractC0427Ujhhgtgfeyxiexzf.f2275Ujhhgtgfeyxiexzf;
            string = (context3 != null ? context3 : null).getString(R.string.net_connect_error);
        } else if (th instanceof NetSocketTimeoutException) {
            Context context4 = AbstractC0427Ujhhgtgfeyxiexzf.f2275Ujhhgtgfeyxiexzf;
            string = (context4 != null ? context4 : null).getString(R.string.net_connect_timeout_error, th.getMessage());
        } else if (th instanceof DownloadFileException) {
            Context context5 = AbstractC0427Ujhhgtgfeyxiexzf.f2275Ujhhgtgfeyxiexzf;
            string = (context5 != null ? context5 : null).getString(R.string.net_download_error);
        } else if (th instanceof ConvertException) {
            Context context6 = AbstractC0427Ujhhgtgfeyxiexzf.f2275Ujhhgtgfeyxiexzf;
            string = (context6 != null ? context6 : null).getString(R.string.net_parse_error);
        } else if (th instanceof RequestParamsException) {
            Context context7 = AbstractC0427Ujhhgtgfeyxiexzf.f2275Ujhhgtgfeyxiexzf;
            string = (context7 != null ? context7 : null).getString(R.string.net_request_error);
        } else if (th instanceof ServerResponseException) {
            Context context8 = AbstractC0427Ujhhgtgfeyxiexzf.f2275Ujhhgtgfeyxiexzf;
            string = (context8 != null ? context8 : null).getString(R.string.net_server_error);
        } else if (th instanceof NullPointerException) {
            Context context9 = AbstractC0427Ujhhgtgfeyxiexzf.f2275Ujhhgtgfeyxiexzf;
            string = (context9 != null ? context9 : null).getString(R.string.net_null_error);
        } else if (th instanceof NoCacheException) {
            Context context10 = AbstractC0427Ujhhgtgfeyxiexzf.f2275Ujhhgtgfeyxiexzf;
            string = (context10 != null ? context10 : null).getString(R.string.net_no_cache_error);
        } else if (th instanceof ResponseException) {
            string = th.getMessage();
        } else if (th instanceof HttpFailureException) {
            Context context11 = AbstractC0427Ujhhgtgfeyxiexzf.f2275Ujhhgtgfeyxiexzf;
            string = (context11 != null ? context11 : null).getString(R.string.request_failure);
        } else if (th instanceof NetException) {
            Context context12 = AbstractC0427Ujhhgtgfeyxiexzf.f2275Ujhhgtgfeyxiexzf;
            string = (context12 != null ? context12 : null).getString(R.string.net_error);
        } else {
            Context context13 = AbstractC0427Ujhhgtgfeyxiexzf.f2275Ujhhgtgfeyxiexzf;
            string = (context13 != null ? context13 : null).getString(R.string.net_other_error);
        }
        AbstractC1243feyxiexzfUjhhgtg.m2735Ujhhgtgfeyxiexzf(th);
        if (string == null) {
            return;
        }
        AbstractC1178feyxiexzfUjhhgtg.m2663Ujhhgtgfeyxiexzf(new C0464Ujhhgtgfeyxiexzf(2, string));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲᛴ */
    public void mo760feyxiexzfUjhhgtg() {
    }
}
