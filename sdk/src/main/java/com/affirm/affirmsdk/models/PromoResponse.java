package com.affirm.affirmsdk.models;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

@AutoValue public abstract class PromoResponse {
  public abstract String pricingTemplate();

  public abstract Float apr();

  public abstract Integer termLength();

  public static TypeAdapter<PromoResponse> typeAdapter(Gson gson) {
    return new AutoValue_PromoResponse.GsonTypeAdapter(gson);
  }

  public static Builder builder() {
    return new AutoValue_PromoResponse.Builder();
  }

  @AutoValue.Builder public abstract static class Builder {
    public abstract Builder setApr(Float value);

    public abstract Builder setTermLength(Integer value);

    public abstract Builder setPricingTemplate(String value);

    public abstract PromoResponse build();
  }
}
