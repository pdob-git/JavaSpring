package pl.pdob.auctions;

import org.springframework.data.repository.CrudRepository;

interface AuctionRepository extends CrudRepository<Auction, Long> {
}
