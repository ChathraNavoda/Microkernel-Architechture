package rfeedbackservicepublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import rfeedbackservicepublisher.RFeedbackServicePublish;
import rfeedbackservicepublisher.RFeedbackServicePublishImpl;

public class RFeedbackServiceActivator implements BundleActivator {
ServiceRegistration publishServiceRegistration;
	
	public void start(BundleContext context) throws Exception {
		System.out.println("Delivery Section");
		RFeedbackServicePublish publisherService = new RFeedbackServicePublishImpl();
		publishServiceRegistration = context.registerService(
				RFeedbackServicePublish.class.getName(), publisherService, null);
	}

	public void stop(BundleContext context) throws Exception {

		System.out.println("Delivery functionality stop");
		publishServiceRegistration.unregister();
		
	}

}
