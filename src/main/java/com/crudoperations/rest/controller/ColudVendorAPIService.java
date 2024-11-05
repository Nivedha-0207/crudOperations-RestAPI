package com.crudoperations.rest.controller;

import com.crudoperations.rest.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class ColudVendorAPIService {

    CloudVendor cloudVendor;
    @GetMapping("{vendorId}")
    public CloudVendor getVendorDetailsById(String vendorId)
    {
        return cloudVendor;
                //("C1","Vendor 1","Address One","1234567890");
    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor){

        this.cloudVendor=cloudVendor;
        return "Sucessfully created vendorDetails";

    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){

        this.cloudVendor=cloudVendor;
        return "Sucessfully updated the vendorDetails";

    }

    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(String vendorId){

        this.cloudVendor=null;
        return "Sucessfully deleted the cloudvendorDetails";

    }


}
