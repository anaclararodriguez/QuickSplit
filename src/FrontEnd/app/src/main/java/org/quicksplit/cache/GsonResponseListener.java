package org.quicksplit.cache;

public interface GsonResponseListener {
    /**
     * @param type response object class type
     * @param responseBody parsed response
     */
    void onCacheableResponse(Class type, Object responseBody);
}
