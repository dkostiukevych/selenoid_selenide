package com.core.ui;

@SuppressWarnings("JavadocType")
public final class PageFactory {

    private PageFactory() {
        throw new UnsupportedOperationException("Illegal access to private constructor!");
    }
    
    public static <T> T at(Class<T> tClass) {
        try {
            return tClass.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
