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

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C2144 extends C0155 {
    @Override // p000.C0155
    public final void mo1199(CancellationException cancellationException) {
        AbstractC2202.m3997(this.f1165);
        super.mo1199(null);
    }

    @Override // p000.C0155
    public final void mo1200(Throwable th) {
        mo1201(th);
    }

    @Override // p000.C0155
    public final void mo1201(Throwable th) {
        String string;
        
        if (th instanceof UnknownHostException) {
            Context context = AbstractC2140.f7078;
            string = (context != null ? context : null).getString(R.string.net_host_error);
        } else if (th instanceof URLParseException) {
            Context context2 = AbstractC2140.f7078;
            string = (context2 != null ? context2 : null).getString(R.string.net_url_error);
        } else if (th instanceof NetConnectException) {
            Context context3 = AbstractC2140.f7078;
            string = (context3 != null ? context3 : null).getString(R.string.net_connect_error);
        } else if (th instanceof NetSocketTimeoutException) {
            Context context4 = AbstractC2140.f7078;
            string = (context4 != null ? context4 : null).getString(R.string.net_connect_timeout_error, th.getMessage());
        } else if (th instanceof DownloadFileException) {
            Context context5 = AbstractC2140.f7078;
            string = (context5 != null ? context5 : null).getString(R.string.net_download_error);
        } else if (th instanceof ConvertException) {
            Context context6 = AbstractC2140.f7078;
            string = (context6 != null ? context6 : null).getString(R.string.net_parse_error);
        } else if (th instanceof RequestParamsException) {
            Context context7 = AbstractC2140.f7078;
            string = (context7 != null ? context7 : null).getString(R.string.net_request_error);
        } else if (th instanceof ServerResponseException) {
            Context context8 = AbstractC2140.f7078;
            string = (context8 != null ? context8 : null).getString(R.string.net_server_error);
        } else if (th instanceof NullPointerException) {
            Context context9 = AbstractC2140.f7078;
            string = (context9 != null ? context9 : null).getString(R.string.net_null_error);
        } else if (th instanceof NoCacheException) {
            Context context10 = AbstractC2140.f7078;
            string = (context10 != null ? context10 : null).getString(R.string.net_no_cache_error);
        } else if (th instanceof ResponseException) {
            string = th.getMessage();
        } else if (th instanceof HttpFailureException) {
            Context context11 = AbstractC2140.f7078;
            string = (context11 != null ? context11 : null).getString(R.string.request_failure);
        } else if (th instanceof NetException) {
            Context context12 = AbstractC2140.f7078;
            string = (context12 != null ? context12 : null).getString(R.string.net_error);
        } else {
            Context context13 = AbstractC2140.f7078;
            string = (context13 != null ? context13 : null).getString(R.string.net_other_error);
        }
        AbstractC2202.m4002(th);
        if (string == null) {
            return;
        }
        AbstractC2861.m4864(new C2150(2, string));
    }

    public void mo618() {
    }
}
