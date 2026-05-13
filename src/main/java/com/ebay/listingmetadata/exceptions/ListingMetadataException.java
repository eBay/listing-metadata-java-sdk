package com.ebay.listingmetadata.exceptions;

/**
 * Base exception for Listing Metadata SDK errors.
 */
public class ListingMetadataException extends RuntimeException {
    public ListingMetadataException(String message) {
        super(message);
    }

    public ListingMetadataException(String message, Throwable cause) {
        super(message, cause);
    }
}
