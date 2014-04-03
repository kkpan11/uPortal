package org.jasig.portal.portlets.marketplace;

import org.jasig.portal.portlet.dao.jpa.MarketplaceRatingPK;

public interface IMarketplaceRating{
    public static final int MAX_RATING = 5;
    public static final int MIN_RATING = 0;
    public static final int REVIEW_MAX_LENGTH=160;
    
    public int getRating();

    public void setRating(int rating);

    public MarketplaceRatingPK getMarketplaceRatingPK();

    public void setMarketplaceRatingPK(MarketplaceRatingPK marketplaceRatingPK);
    
    /**
     * 
     * @return a text Review of portlet
     */
    public String getReview();
    
    /**
     * Will truncate all review inputs to {@value #REVIEW_MAX_LENGTH}
     * will trim all leading and following whitespaces
     * @param review a text review of the portlet
     */
    public void setReview(String review);
}
