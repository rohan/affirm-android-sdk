package com.affirm.affirmsdk.utils;

import com.affirm.affirmsdk.AffirmWebViewClient;
import com.affirm.affirmsdk.models.Merchant;

public class MerchantFactory {

  public static Merchant create() {
    return Merchant.builder()
        .setPublicApiKey("sdf")
        .setConfirmationUrl(AffirmWebViewClient.AFFIRM_CHECKOUT_CONFIRMATION_URL)
        .setCancelUrl(AffirmWebViewClient.AFFIRM_CHECKOUT_CANCELLATION_URL)
        .build();
  }
}
