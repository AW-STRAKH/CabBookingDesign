package com.awatansh.cabbooking.strategies;

import com.awatansh.cabbooking.model.Cab;
import com.awatansh.cabbooking.model.Location;
import com.awatansh.cabbooking.model.Rider;
import java.util.List;

public interface CabMatchingStrategy {

  Cab matchCabToRider(Rider rider, List<Cab> candidateCabs, Location fromPoint, Location toPoint);
}
