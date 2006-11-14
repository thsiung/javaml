/**
 * ClusterEvaluationCriterion.java, 31-okt-06
 *
 * This file is part of the Java Machine Learning API
 * 
 * php-agenda is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * The Java Machine Learning API is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with the Java Machine Learning API; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 * 
 * Copyright (c) 2006, Andreas De Rijcke
 * 
 * Project: http://sourceforge.net/projects/java-ml/
 * 
 */



package net.sf.javaml.clustering.evaluation;

import net.sf.javaml.core.Dataset;
import net.sf.javaml.core.Instance;
import net.sf.javaml.distance.DistanceMeasure;
import net.sf.javaml.distance.DistanceMeasureFactory;

public class CosSim  {
	
	public static double cosSim (Dataset data[], Instance centroids[], int k){
		double cosSim = 0;
		DistanceMeasure dm=DistanceMeasureFactory.getCosineSimilarity();
		for (int i =0; i<k; i++ ){
			System.out.println("i = "+i);
			System.out.println("data["+i+"]size = "+data[i].size());
			for (int j=0; j< data[i].size(); j++){
				cosSim += dm.calculateDistance(data[i].getInstance(j), centroids[i]);
			}
		}
		return cosSim;
	}
}