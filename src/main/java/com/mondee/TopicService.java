package com.mondee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topicList = new ArrayList<>(Arrays.asList( new Topic("101","Java","OOPS"),
			new Topic("102","Hibernate","Configuration"),
			new Topic("102","Spring","Dependency Injection")));
			
	public Topic getTopic(String id) {
	
		Topic x = null;
		for(Topic i:topicList) {
			if(i.getTid().equals(id))
				x=i;
		}
		return x;
	}
	
	public void updateTopic(String id) {
		for(Topic i:topicList) {
			if(i.getTid().equals(id))
				topicList.set(2, i);
				
		}
	}
	
	public List<Topic> getAllTopics(){
		return topicList;
	}

	public void addTopic(Topic topic) {
		topicList.add(topic);
		
	}
	
	public void deleteTopic(String id) {
		for(Topic i:topicList) {
			if(i.getTid().equals(id))
				topicList.remove(i);
		}
	}

}
