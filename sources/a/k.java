/*
 * Decompiled with CFR 0_132.
 * 
 * Could not load the following classes:
 *  org.apache.http.HttpEntity
 *  org.apache.http.client.CookieStore
 *  org.apache.http.client.methods.CloseableHttpResponse
 *  org.apache.http.client.methods.HttpGet
 *  org.apache.http.client.methods.HttpUriRequest
 *  org.apache.http.client.protocol.HttpClientContext
 *  org.apache.http.cookie.Cookie
 *  org.apache.http.impl.client.BasicCookieStore
 *  org.apache.http.impl.client.CloseableHttpClient
 *  org.apache.http.impl.client.HttpClientBuilder
 *  org.apache.http.protocol.HttpContext
 *  org.apache.http.util.EntityUtils
 */
import java.util.List;
import org.apache.http.HttpEntity;
import org.apache.http.client.CookieStore;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.EntityUtils;

public final class k {
    private static List d = null;

    public static String c(bb object) {
        String string;
        string = "";
        try {
            object = object.getUrl();
            CloseableHttpClient closeableHttpClient = HttpClientBuilder.create().build();
            object = new HttpGet((String)object);
            object.addHeader("Host", "www.pagesblanches.be");
            object.addHeader("User-Agent", "Mozilla/3.0 (compatible; Indy Library)");
            Object object2 = new HttpClientContext();
            object = closeableHttpClient.execute((HttpUriRequest)object, (HttpContext)object2);
            HttpEntity httpEntity = object.getEntity();
            String string2 = EntityUtils.toString((HttpEntity)httpEntity, (String)"UTF-8");
            string2 = string2.substring(1);
            object2 = object2.getCookieStore();
            object2 = object2.getCookies();
            d = object2;
            string = string2;
            EntityUtils.consume((HttpEntity)httpEntity);
            object.close();
            closeableHttpClient.close();
        }
        catch (Throwable throwable) {}
        return string;
    }

    public static String d(bb object) {
        String string;
        string = "";
        try {
            BasicCookieStore basicCookieStore;
            HttpEntity httpEntity2;
            object = object.getUrl();
            CloseableHttpClient closeableHttpClient = HttpClientBuilder.create().build();
            HttpClientContext httpClientContext = new HttpClientContext();
            object = new HttpGet((String)object);
            object.addHeader("Host", "www.pagesblanches.be");
            object.addHeader("User-Agent", "Mozilla/3.0 (compatible; Indy Library)");
            if (d != null) {
                basicCookieStore = new BasicCookieStore();
                for (HttpEntity httpEntity2 : d) {
                    basicCookieStore.addCookie((Cookie)httpEntity2);
                }
                httpClientContext.setCookieStore((CookieStore)basicCookieStore);
            }
            basicCookieStore = closeableHttpClient.execute((HttpUriRequest)object, (HttpContext)httpClientContext);
            httpEntity2 = basicCookieStore.getEntity();
            String string2 = EntityUtils.toString((HttpEntity)httpEntity2, (String)"UTF-8");
            object = string2.substring(1);
            string = object;
            EntityUtils.consume((HttpEntity)httpEntity2);
            basicCookieStore.close();
            closeableHttpClient.close();
        }
        catch (Throwable throwable) {}
        return string;
    }
}

