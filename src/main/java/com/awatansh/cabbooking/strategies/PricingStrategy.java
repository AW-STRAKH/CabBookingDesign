package com.awatansh.cabbooking.strategies;

import com.awatansh.cabbooking.model.Location;

public interface PricingStrategy {
  Double findPrice(Location fromPoint, Location toPoint);
}
