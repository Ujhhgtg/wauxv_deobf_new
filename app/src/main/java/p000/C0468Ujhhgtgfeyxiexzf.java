package p000;

import com.drake.net.exception.HttpFailureException;
import com.drake.net.exception.NetConnectException;
import com.drake.net.exception.NetException;
import com.drake.net.exception.NetSocketTimeoutException;
import com.drake.net.exception.NetUnknownHostException;
import com.drake.net.exception.NoCacheException;
import java.lang.ref.WeakReference;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛴᛳ能不能要点脸ᛲᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0468Ujhhgtgfeyxiexzf implements Interceptor {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final C0468Ujhhgtgfeyxiexzf f2376Ujhhgtgfeyxiexzf = new C0468Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static void m1786Ujhhgtgfeyxiexzf(Interceptor.Chain chain) {
        AbstractC0427Ujhhgtgfeyxiexzf.f2280Ujhhgtgfeyxiexzf.add(new WeakReference(chain.call()));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static void m1787Ujhhgtgfeyxiexzf(Interceptor.Chain chain) {
        Iterator it = AbstractC0427Ujhhgtgfeyxiexzf.f2280Ujhhgtgfeyxiexzf.iterator();
        while (it.hasNext()) {
            Call call = (Call) ((WeakReference) it.next()).get();
            if (call == null) {
                it.remove();
            } else if (call.equals(chain.call())) {
                it.remove();
                return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v4, types: [okhttp3.Response, 上海高中ᛱ谢子非ᛱ要点脸ᛴᛱUjhhgtgᛱᛱfeyxiexzfᛱ能不能ᛲᛳ] */
    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        ConnectException connectException;
        Throwable th;
        Response responseProceed;
        Request request = chain.request();
        RequestBody requestBodyBody = request.body();
        C0466Ujhhgtgfeyxiexzf c0466Ujhhgtgfeyxiexzf = requestBodyBody != null ? new C0466Ujhhgtgfeyxiexzf(requestBodyBody, (ConcurrentLinkedQueue) request.tag(AbstractC1248feyxiexzfUjhhgtg.class)) : null;
        C3521Ujhhgtgfeyxiexzf c3521Ujhhgtgfeyxiexzf = (C3521Ujhhgtgfeyxiexzf) request.tag(C3521Ujhhgtgfeyxiexzf.class);
        ?? r1 = c3521Ujhhgtgfeyxiexzf;
        if (c3521Ujhhgtgfeyxiexzf == null) {
            r1 = AbstractC0427Ujhhgtgfeyxiexzf.f2277Ujhhgtgfeyxiexzf;
        }
        EnumC2631Ujhhgtgfeyxiexzf enumC2631Ujhhgtgfeyxiexzf = (EnumC2631Ujhhgtgfeyxiexzf) request.tag(EnumC2631Ujhhgtgfeyxiexzf.class);
        Request.Builder builderNewBuilder = request.newBuilder();
        if (r1 != 0 && enumC2631Ujhhgtgfeyxiexzf != null) {
            builderNewBuilder.cacheControl(new CacheControl.Builder().noCache().noStore().build());
        }
        Request requestBuild = builderNewBuilder.method(request.method(), c0466Ujhhgtgfeyxiexzf).build();
        try {
            try {
                try {
                    m1786Ujhhgtgfeyxiexzf(chain);
                    if (r1 != 0) {
                        int i = enumC2631Ujhhgtgfeyxiexzf == null ? -1 : AbstractC0434Ujhhgtgfeyxiexzf.f2292Ujhhgtgfeyxiexzf[enumC2631Ujhhgtgfeyxiexzf.ordinal()];
                        if (i == 1) {
                            responseProceed = r1.m5080Ujhhgtgfeyxiexzf(requestBuild);
                            if (responseProceed == null) {
                                throw new NoCacheException(requestBuild, null, null, 6, null);
                            }
                        } else if (i == 2) {
                            responseProceed = r1.m5080Ujhhgtgfeyxiexzf(requestBuild);
                            if (responseProceed == null) {
                                responseProceed = r1.m5081Ujhhgtgfeyxiexzf(chain.proceed(requestBuild));
                            }
                        } else if (i != 3) {
                            responseProceed = i != 4 ? chain.proceed(requestBuild) : r1.m5081Ujhhgtgfeyxiexzf(chain.proceed(requestBuild));
                        } else {
                            try {
                                responseProceed = r1.m5081Ujhhgtgfeyxiexzf(chain.proceed(requestBuild));
                            } catch (Exception unused) {
                                responseProceed = r1.m5080Ujhhgtgfeyxiexzf(requestBuild);
                                if (responseProceed == null) {
                                    throw new NoCacheException(requestBuild, null, null, 6, null);
                                }
                            }
                        }
                    } else {
                        responseProceed = chain.proceed(requestBuild);
                    }
                    Response response = responseProceed;
                    try {
                        ResponseBody responseBodyBody = response.body();
                        Response responseBuild = response.newBuilder().body(responseBodyBody != null ? new C0474Ujhhgtgfeyxiexzf(responseBodyBody, (ConcurrentLinkedQueue) requestBuild.tag(AbstractC1244feyxiexzfUjhhgtg.class), new C0467Ujhhgtgfeyxiexzf(chain)) : null).build();
                        if ((responseBuild != null ? responseBuild.body() : null) == null) {
                            m1787Ujhhgtgfeyxiexzf(chain);
                        }
                        return responseBuild;
                    } catch (NetException e) {
                        throw e;
                    } catch (ConnectException e2) {
                        connectException = e2;
                        throw new NetConnectException(requestBuild, null, connectException, 2, null);
                    } catch (SocketTimeoutException e3) {
                        e = e3;
                        throw new NetSocketTimeoutException(requestBuild, e.getMessage(), e);
                    } catch (UnknownHostException e4) {
                        e = e4;
                        throw new NetUnknownHostException(requestBuild, e.getMessage(), null, 4, null);
                    } catch (Throwable th2) {
                        th = th2;
                        throw new HttpFailureException(requestBuild, null, th, 2, null);
                    }
                } catch (Throwable th3) {
                    if ((r1 != 0 ? r1.body() : null) == null) {
                        m1787Ujhhgtgfeyxiexzf(chain);
                    }
                    throw th3;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (NetException e5) {
            throw e5;
        } catch (ConnectException e6) {
            connectException = e6;
        } catch (SocketTimeoutException e7) {
            e = e7;
        } catch (UnknownHostException e8) {
            e = e8;
        }
    }
}
