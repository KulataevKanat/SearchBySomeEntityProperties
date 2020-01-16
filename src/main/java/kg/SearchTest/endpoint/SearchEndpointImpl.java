package kg.SearchTest.endpoint;

import kg.SearchTest.dto.SearchDto;
import kg.SearchTest.model.Search;
import kg.SearchTest.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchEndpointImpl implements SearchEndpoint {
    @Autowired
    private SearchService searchService;

    @Override
    public List<SearchDto> resultList(String search) {
        return SearchDto.toList(searchService.findNoteBookByName(search),
                searchService.findPCByName(search),
                searchService.findPhoneByName(search),
                searchService.findPSBookByName(search)
        );
    }
}
