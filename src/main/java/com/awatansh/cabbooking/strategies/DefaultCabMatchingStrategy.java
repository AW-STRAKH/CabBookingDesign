package com.awatansh.cabbooking.strategies;

import com.awatansh.cabbooking.model.Cab;
import com.awatansh.cabbooking.model.Location;
import com.awatansh.cabbooking.model.Rider;
import java.util.List;
import lombok.NonNull;

public class DefaultCabMatchingStrategy implements CabMatchingStrategy {

  @Override
  public Cab matchCabToRider(
      @NonNull final Rider rider,
      @NonNull final List<Cab> candidateCabs,
      @NonNull final Location fromPoint,
      @NonNull final Location toPoint) {
    if (candidateCabs.isEmpty()) {
      return null;
    }
    return candidateCabs.get(0);
  }
}
