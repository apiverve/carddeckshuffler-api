# frozen_string_literal: true

Gem::Specification.new do |spec|
  spec.name          = "apiverve_carddeckshuffler"
  spec.version       = "1.2.3"
  spec.authors       = ["APIVerve"]
  spec.email         = ["hello@apiverve.com"]

  spec.summary       = "Card Deck Shuffler API - Ruby Client"
  spec.description   = "Card Deck Shuffler randomizes standard playing card decks using Fisher-Yates or riffle algorithms. Pass the deck count and optional jokers to get the full ordered cards with rank, suit, shorthand symbols, and the top card."
  spec.homepage      = "https://apiverve.com/marketplace/carddeckshuffler?utm_source=ruby&utm_medium=referral&utm_content=homepage"
  spec.license       = "MIT"
  spec.required_ruby_version = ">= 2.7.0"

  spec.metadata["homepage_uri"] = spec.homepage
  spec.metadata["source_code_uri"] = "https://github.com/apiverve/carddeckshuffler-API/tree/main/ruby"
  spec.metadata["changelog_uri"] = "https://apiverve.com/changelog"
  spec.metadata["documentation_uri"] = "https://docs.apiverve.com/ref/carddeckshuffler"

  spec.files = Dir.glob("{lib}/**/*") + %w[README.md LICENSE]
  spec.require_paths = ["lib"]

  spec.add_dependency "faraday", ">= 1.0", "< 3.0"
  spec.add_dependency "faraday-multipart", "~> 1.0"
  spec.add_dependency "json", "~> 2.0"
end
