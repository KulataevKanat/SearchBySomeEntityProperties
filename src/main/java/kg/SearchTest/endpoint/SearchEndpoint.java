package kg.SearchTest.endpoint;

import kg.SearchTest.dto.SearchDto;

import java.util.List;

public interface SearchEndpoint {
    List<SearchDto> resultList(String search);
}
