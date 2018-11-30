package f1springboot.topic;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topiclist = new ArrayList<Topic>(
			Arrays.asList(
			new Topic("Spring","spring frame work","springproject"),
			new Topic("java","javaproject","ccore java"),
				new Topic("project","project1","project1")
				)
			);
public List<Topic> getalltopics(){
	return topiclist;
}


public Topic getTopic(String id) {
	for(int i = 0 ; i < topiclist.size();i++)
	{
		if(topiclist.get(i).getId().equals(id)) {
		
			return (Topic)topiclist.get(i);
		}
	}
	return null;
	
}


public void addTopics(Topic topic) {
         topiclist.add(topic);
	
}


public void updateTopic(Topic topic, String id) {
	for(int i = 0 ; i < topiclist.size();i++)
	{
		if(topiclist.get(i).getId().equals(id)) {
		
			topiclist.set(i, topic);
		}
	}
	
}


public void deleteTopic(String id) {
	for(int i = 0 ; i < topiclist.size();i++)
	{
		if(topiclist.get(i).getId().equals(id)) {
		
			topiclist.remove(i);
		}
	}
	
}





}
